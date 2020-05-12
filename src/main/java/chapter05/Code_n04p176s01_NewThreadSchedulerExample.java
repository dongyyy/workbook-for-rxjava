package chapter05;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Code_n04p176s01_NewThreadSchedulerExample {

    public static void main(String[] args) {
        String[] objs = {"1", "3", "5"};

        Observable.fromArray(objs)
                .doOnNext(data -> Log.v("Original data : " + data))
                .map(data -> "<<" + data + ">>")
                .subscribeOn(Schedulers.newThread())
                .subscribe(Log::i);
        Utils.sleep(1000);

        Observable.fromArray(objs)
                .doOnNext(data -> Log.v("Original data : " + data))
                .map(data -> "##" + data + "##")
                .subscribeOn(Schedulers.newThread())
                .subscribe(Log::i);
        Utils.sleep(1000);
    }
}
