package chapter03;

import common.Log;
import io.reactivex.Observable;

public class Code_n01p86s01_MapExample {

    public static void main(String[] args) {
        String[] balls = {"1", "2", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .map(ball -> ball + "<>");

        source.subscribe(Log::d);
    }
}
