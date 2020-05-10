package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n08p119s01_IntervalRangeExample {

    public static void main(String[] args) {
        Observable<Long> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(val -> val + 1)
                .take(5);
        source.subscribe(Log::i);
        Utils.sleep(1000);
    }
}
