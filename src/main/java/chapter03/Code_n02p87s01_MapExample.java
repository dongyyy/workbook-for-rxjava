package chapter03;

import common.Log;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class Code_n02p87s01_MapExample {

    public static void main(String[] args) {
        Function<String, String> getDiamond = ball -> ball + "<>";

        String[] balls = {"1", "2", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .map(getDiamond);

        source.subscribe(Log::d);
    }
}
