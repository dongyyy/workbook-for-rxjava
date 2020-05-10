package chapter04;

import common.Log;
import common.OkHttpHelper;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n12p124s01_RepeatExample {

    public static void main(String[] args) {
        Utils.exampleStart();
        String serverUrl = "https://api.github.com/zen";

        Observable.timer(2, TimeUnit.MILLISECONDS)
                .map(val -> serverUrl)
                .map(OkHttpHelper::get)
                .repeat()
                .subscribe(res -> Log.i("Ping Result : " + res));
        Utils.sleep(10000);
    }
}
