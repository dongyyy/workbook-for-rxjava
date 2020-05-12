package chapter05;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Code_n07p182s01_TrampolineSchedulerExample {

    public static void main(String[] args) {
        String[] objs = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(objs);

        source.subscribeOn(Schedulers.trampoline())
                .map(data -> "<<" + data + ">>")
                .subscribe(Log::i);

        source.subscribeOn(Schedulers.trampoline())
                .map(data -> "##" + data + "##")
                .subscribe(Log::i);

        Utils.sleep(500);
    }
}
