package chapter04;

import common.Log;
import io.reactivex.Observable;

public class Code_n11p123s01_RepeatExample {

    public static void main(String[] args) {
        String[] balls = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(balls).repeat(3);

        source.doOnComplete(() -> Log.d("onComplete")).subscribe(Log::i);
    }
}
