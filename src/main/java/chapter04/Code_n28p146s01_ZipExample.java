package chapter04;

import common.Log;
import io.reactivex.Observable;

public class Code_n28p146s01_ZipExample {

    public static void main(String[] args) {
        Observable<Integer> source = Observable.zip(
                Observable.just(100, 200, 300),
                Observable.just(10, 20, 30),
                (a, b) -> a + b)
                .zipWith(Observable.just(1, 2, 3), (ab, c) -> ab + c);

        source.subscribe(Log::i);
    }
}
