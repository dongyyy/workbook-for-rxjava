package chapter02;

import common.Utils;
import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class Code_n29p79s01_ConnectableObservableExample {

    public static void main(String[] args) {
        String[] dt = {"1", "3", "5"};
        Observable<String> balls = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(Long::intValue)
                .map(i -> dt[i])
                .take(dt.length);
        ConnectableObservable<String> source = balls.publish();
        source.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        source.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        source.connect();

        Utils.sleep(250);
        source.subscribe(data -> System.out.println("Subscriber #3 => " + data));
        Utils.sleep(100);
    }
}
