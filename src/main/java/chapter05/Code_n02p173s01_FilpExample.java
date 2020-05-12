package chapter05;

import common.Log;
import common.Shape;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class Code_n02p173s01_FilpExample {

    public static void main(String[] args) {
        String[] objs = {"1-S", "2-T", "3-P"};
        Observable<String> source = Observable.fromArray(objs)
                .doOnNext(data -> Log.v("Original data = " + data))
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.newThread())
                .map(Shape::flip);

        source.subscribe(Log::i);
        Utils.sleep(1000);
    }
}
