package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n07p118s01_IntervalRangeExample {

    public static void main(String[] args) {
        Observable<Long> source = Observable.intervalRange(1, 5, 100L, 100L, TimeUnit.MILLISECONDS);
        source.subscribe(Log::i);
        Utils.sleep(1000);
    }
}
