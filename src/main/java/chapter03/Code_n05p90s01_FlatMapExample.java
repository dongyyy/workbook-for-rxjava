package chapter03;

import common.Log;
import io.reactivex.Observable;

public class Code_n05p90s01_FlatMapExample {

    public static void main(String[] args) {
        String[] balls = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .flatMap(ball -> Observable.just(ball + "<>", ball + "<>"));

        source.subscribe(Log::d);
    }
}
