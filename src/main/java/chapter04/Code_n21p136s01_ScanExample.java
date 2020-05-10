package chapter04;

import common.Log;
import io.reactivex.Observable;

public class Code_n21p136s01_ScanExample {

    public static void main(String[] args) {
        String[] balls = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .scan((ball1, ball2) -> ball2 + "(" + ball1 + ")");
        source.subscribe(Log::i);
    }
}
