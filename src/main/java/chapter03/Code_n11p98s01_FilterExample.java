package chapter03;

import common.Log;
import io.reactivex.Observable;

public class Code_n11p98s01_FilterExample {

    public static void main(String[] args) {
        String[] objs = {"1 CIRCLE", "2 DIAMOND", "3 TRIANGLE", "4 DIAMOND", "5 CIRCLE", "6 HEXAGON"};
        Observable<String> source = Observable.fromArray(objs)
                .filter(obj -> obj.endsWith("CIRCLE"));
        source.subscribe(Log::d);
    }
}
