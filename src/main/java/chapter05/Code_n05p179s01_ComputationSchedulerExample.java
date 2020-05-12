package chapter05;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class Code_n05p179s01_ComputationSchedulerExample {

    public static void main(String[] args) {
        String[] objs = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(objs)
                .zipWith(Observable.interval(100L, TimeUnit.MILLISECONDS), (a, b) -> a);

        source.map(item -> "<<" + item + ">>")
                .subscribeOn(Schedulers.computation())
                .subscribe(Log::i);

        source.map(item -> "##" + item + "##")
                .subscribeOn(Schedulers.computation())
                .subscribe(Log::i);
        Utils.sleep(1000);
    }
}
