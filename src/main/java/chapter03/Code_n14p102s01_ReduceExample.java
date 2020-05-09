package chapter03;

import common.Log;
import io.reactivex.Maybe;
import io.reactivex.Observable;

public class Code_n14p102s01_ReduceExample {

    public static void main(String[] args) {
        String[] balls = {"1", "3", "5"};
        Maybe<String> source = Observable.fromArray(balls)
                .reduce((ball1, ball2) -> ball2 + "(" + ball1 + ")");
        source.subscribe(Log::d);
    }
}
