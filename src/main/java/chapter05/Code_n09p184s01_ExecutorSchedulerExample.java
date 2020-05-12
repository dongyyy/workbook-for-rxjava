package chapter05;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Code_n09p184s01_ExecutorSchedulerExample {

    public static void main(String[] args) {
        final int THREAD_NUM = 10;

        String[] data = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(data);
        Executor executor = Executors.newFixedThreadPool(THREAD_NUM);

        source.subscribeOn(Schedulers.from(executor)).subscribe(Log::i);
        source.subscribeOn(Schedulers.from(executor)).subscribe(Log::i);
        Utils.sleep(500);
    }
}
