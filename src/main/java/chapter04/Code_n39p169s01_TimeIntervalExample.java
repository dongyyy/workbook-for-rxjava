package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Timed;

public class Code_n39p169s01_TimeIntervalExample {

    public static void main(String[] args) {
        Utils.exampleStart();
        String[] data = {"1", "3", "7"};
        Observable<Timed<String>> source = Observable.fromArray(data)
                .delay(item -> {
                    Utils.doSomething();
                    return Observable.just(item);
                })
                .timeInterval();

        source.subscribe(Log::it);
        Utils.sleep(1000);
    }
}
