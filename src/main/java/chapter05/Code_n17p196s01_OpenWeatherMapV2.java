package chapter05;

import common.Log;
import common.OkHttpHelper;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code_n17p196s01_OpenWeatherMapV2 {
    
    public static void main(String[] args) {
        OpenWeatherMapV2 demo = new OpenWeatherMapV2();
        demo.run();
    }
}

class OpenWeatherMapV2 {

    private static final String URL = "http://api.openweathermap.org/data/2.5/weather?q=London&APPID=";

    public void run() {
        Observable<String> source = Observable.just(URL + "API_KEY")
                .map(OkHttpHelper::getWithLog)
                .subscribeOn(Schedulers.io())
                .share()
                .observeOn(Schedulers.newThread());

        Observable<String> temperature = source.map(this::parseTemperature);
        Observable<String> city = source.map(this::parseCityName);
        Observable<String> country = source.map(this::parseCountry);

        Utils.exampleStart();

        Observable.concat(temperature, city, country)
                .observeOn(Schedulers.newThread())
                .subscribe(Log::it);

        Utils.sleep(1000);
    }

    private String parseTemperature(String json) {
        return parse(json, "\"temp\":[0-9]*.[0-9]*");
    }

    private String parseCityName(String json) {
        return parse(json, "\"name\":\"[a-zA-Z]*\"");
    }

    private String parseCountry(String json) {
        return parse(json, "\"country\":\"[a-zA-Z]*\"");
    }

    private String parse(String json, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(json);
        if (match.find()) {
            return match.group();
        }
        return "N/A";
    }
}
