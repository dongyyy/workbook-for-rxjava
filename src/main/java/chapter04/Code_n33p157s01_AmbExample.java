package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Code_n33p157s01_AmbExample {

    public static void main(String[] args) {
        String[] data1 = {"1", "3", "5"};
        String[] data2 = {"2-R", "4-R"};

        List<Observable<String>> sources = Arrays.asList(
                Observable.fromArray(data1)
                        .delay(100L, TimeUnit.MILLISECONDS)
                        .doOnComplete(() -> Log.d("Observable #1 : onComplete()")),
                Observable.fromArray(data2)
                        .doOnComplete(() -> Log.d("Observable #2 : onComplete()"))
        );

        Observable.amb(sources)
                .doOnComplete(() -> Log.d("Result : onComplete()"))
                .subscribe(Log::i);
        Utils.sleep(1000);

    }
}
