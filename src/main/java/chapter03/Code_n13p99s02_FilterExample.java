package chapter03;

import common.Log;
import io.reactivex.Observable;
import io.reactivex.Single;

public class Code_n13p99s02_FilterExample {

    public static void main(String[] args) {
        Integer[] numbers = {100, 200, 300, 400, 500};
        Single<Integer> single;
        Observable<Integer> source;

        // 1. first
        single = Observable.fromArray(numbers).first(-1);
        single.subscribe(data -> Log.d("first() value = " + data));

        // 2. last
        single = Observable.fromArray(numbers).last(999);
        single.subscribe(data -> Log.d("last() value = " + data));

        // 3. take(N)
        source = Observable.fromArray(numbers).take(3);
        source.subscribe(data -> Log.d("take(3) values = " + data));

        // 4. takeLast(N)
        source = Observable.fromArray(numbers).takeLast(3);
        source.subscribe(data -> Log.d("takeLast(3) values = " + data));

        // 5. skip(N)
        source = Observable.fromArray(numbers).skip(2);
        source.subscribe(data -> Log.d("skip(2) values = " + data));

        // 6. skipLast(N)
        source = Observable.fromArray(numbers).skipLast(2);
        source.subscribe(data -> Log.d("skipLast(2) values = " + data));
    }
}
