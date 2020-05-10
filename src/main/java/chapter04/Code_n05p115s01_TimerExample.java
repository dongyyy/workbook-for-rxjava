package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Code_n05p115s01_TimerExample {

    public static void main(String[] args) {
        Utils.exampleStart();
        Observable<String> source = Observable.timer(500L, TimeUnit.MILLISECONDS)
                .map(notUsed -> new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
        source.subscribe(Log::it);
        Utils.sleep(1000);
    }
}
