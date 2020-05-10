package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Code_n15p128s01_ConcatMapExample {

    public static void main(String[] args) {
        Utils.exampleStart();
        String[] balls = {"1", "3", "5"};
        Observable<String> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
                .map(Long::intValue)
                .map(idx -> balls[idx])
                .take(balls.length)
                .flatMap(ball -> Observable.interval(200L, TimeUnit.MILLISECONDS)
                        .map(notUsed -> ball + "<>")
                        .take(2)
                );
        source.subscribe(Log::it);
        Utils.sleep(2000);
    }
}
