package chapter05;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.io.File;

public class Code_n06p180s01_IOSchedulerExample {

    public static void main(String[] args) {
        String root = "/";
        File[] files = new File(root).listFiles();
        Observable<String> source = Observable.fromArray(files)
                .filter(f -> !f.isDirectory())
                .map(f -> f.getAbsolutePath())
                .subscribeOn(Schedulers.io());

        source.subscribe(Log::i);
        Utils.sleep(500);
    }
}
