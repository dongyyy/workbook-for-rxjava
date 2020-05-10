package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.functions.Action;

import java.util.concurrent.TimeUnit;

public class Code_n32p154s01_ConcatExample {

    public static void main(String[] args) {
        Action onCompleteAction = () -> Log.d("onComplete()");

        String[] data1 = {"1", "3", "5"};
        String[] data2 = {"2", "4", "6"};

        Observable<String> source1 = Observable.fromArray(data1)
                .doOnComplete(onCompleteAction);

        Observable<String> source2 = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(Long::intValue)
                .map(idx -> data2[idx])
                .take(data2.length)
                .doOnComplete(onCompleteAction);

        Observable<String> source = Observable.concat(source1, source2)
                .doOnComplete(onCompleteAction);

        source.subscribe(Log::i);
        Utils.sleep(1000);

    }
}
