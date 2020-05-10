package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n38p167s01_DealyExample {

    public static void main(String[] args) {
        Utils.exampleStart();
        String[] data = {"1", "7", "2", "3", "4"};
        Observable<String> source = Observable.fromArray(data)
                .delay(100L, TimeUnit.MILLISECONDS);
        source.subscribe(Log::it);
        Utils.sleep(1000);
    }
}
