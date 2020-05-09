package chapter03;

import common.Log;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

public class Code_n15p103s01_ReduceExample {

    public static void main(String[] args) {
        BiFunction<String, String ,String> mergeBalls
                = (ball1, ball2) -> ball2 + "(" + ball1 + ")";
        String[] balls = {"1", "3", "5"};
        Maybe<String> source = Observable.fromArray(balls)
                .reduce(mergeBalls);
        source.subscribe(Log::d);
    }
}
