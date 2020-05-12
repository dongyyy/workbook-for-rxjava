package chapter05;

import common.Log;
import io.reactivex.Observable;

public class Code_n01p172s01_HelloRxJava2V2 {

    public static void main(String[] args) {
        Observable.just("Hello", "RxJava 2!!")
                .subscribe(Log::i);
    }
}
