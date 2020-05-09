package chapter03;

import common.Log;
import io.reactivex.Observable;

public class Code_n12p99s01_FilterExample {

    public static void main(String[] args) {
        Integer[] data = {100, 34, 27, 99, 50};
        Observable<Integer> source = Observable.fromArray(data)
                .filter(number -> number % 2 == 0);
        source.subscribe(Log::d);
    }
}
