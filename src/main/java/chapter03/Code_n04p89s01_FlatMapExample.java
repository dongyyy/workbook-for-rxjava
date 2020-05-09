package chapter03;

import common.Log;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class Code_n04p89s01_FlatMapExample {

    public static void main(String[] args) {
        Function<String, Observable<String>> getDoubleDiamonds = ball ->
                Observable.just(ball + "<>", ball + "<>");

        String[] balls = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .flatMap(getDoubleDiamonds);

        source.subscribe(Log::d);
    }
}
