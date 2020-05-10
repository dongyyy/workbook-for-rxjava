package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n01p112s01_IntervalExample {

    public static void main(String[] args) {
        Utils.exampleStart();
        Observable<Long> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(data -> (data + 1) * 100)
                .take(5);
        source.subscribe(Log::it);
        Utils.sleep(1000);
    }
}
