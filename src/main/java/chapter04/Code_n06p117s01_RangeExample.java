package chapter04;

import common.Log;
import io.reactivex.Observable;

public class Code_n06p117s01_RangeExample {

    public static void main(String[] args) {
        Observable<Integer> source = Observable.range(1, 10)
                .filter(number -> number % 2 == 0);
        source.subscribe(Log::i);
    }
}
