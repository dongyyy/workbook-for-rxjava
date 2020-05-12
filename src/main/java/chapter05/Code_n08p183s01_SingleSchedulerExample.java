package chapter05;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Code_n08p183s01_SingleSchedulerExample {

    public static void main(String[] args) {
        Observable<Integer> numbers = Observable.range(100, 5);
        Observable<String> chars = Observable.range(0, 5)
                .map(Utils::numberToAlphabet);

        numbers.subscribeOn(Schedulers.single()).subscribe(Log::i);
        chars.subscribeOn(Schedulers.single()).subscribe(Log::i);

        Utils.sleep(500);
    }
}
