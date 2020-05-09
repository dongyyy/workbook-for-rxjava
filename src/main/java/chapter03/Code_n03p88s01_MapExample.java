package chapter03;

import common.Log;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class Code_n03p88s01_MapExample {

    public static void main(String[] args) {
        Function<String, Integer> ballToIndex = ball -> {
            switch (ball) {
                case "RED": return 1;
                case "YELLOW": return 2;
                case "GREEN": return 3;
                case "BLUE": return 5;
                default: return -1;
            }
        };

        String[] balls = {"RED", "YELLOW", "GREEN", "BLUE"};
        Observable<Integer> source = Observable.fromArray(balls)
                .map(ballToIndex);

        source.subscribe(Log::d);
    }
}
