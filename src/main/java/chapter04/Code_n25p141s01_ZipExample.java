package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n25p141s01_ZipExample {

    public static void main(String[] args) {
        Observable<String> source = Observable.zip(
                Observable.just("RED", "GREEN", "BLUE"),
                Observable.interval(200L, TimeUnit.MILLISECONDS),
                (value, i) -> value);

        Utils.exampleStart();
        source.subscribe(Log::it);
        Utils.sleep(1000);
    }
}
