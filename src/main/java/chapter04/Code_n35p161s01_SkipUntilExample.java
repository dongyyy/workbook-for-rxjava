package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n35p161s01_SkipUntilExample {

    public static void main(String[] args) {
        String[] data = {"1", "2", "3", "4", "5", "6"};

        Observable<String> source = Observable.fromArray(data)
                .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (val, notUsed) -> val)
                .skipUntil(Observable.timer(500L, TimeUnit.MILLISECONDS));

        source.subscribe(Log::i);
        Utils.sleep(1000);
    }
}
