package chapter05;

import common.Log;
import common.OkHttpHelper;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Code_n16p190s01_CallbackHeaven {

    public static final String GITHUB_ROOT = "https://raw.githubusercontent.com/yudong80/reactivejava/master/";

    public static final String FIRST_URL = "https://api.github.com/zen";
    public static final String SECOND_URL = GITHUB_ROOT + "/samples/callback_hell";

    public static void main(String[] args) {
        Utils.exampleStart();

        Observable<String> first = Observable.just(FIRST_URL)
                .subscribeOn(Schedulers.io())
                .map(OkHttpHelper::get);

        Observable<String> second = Observable.just(SECOND_URL)
                .subscribeOn(Schedulers.io())
                .map(OkHttpHelper::get);

        Observable.zip(first, second, (a, b) -> ("\n>> " + a + "\n>> " + b))
                .subscribe(Log::it);

        Utils.sleep(5000);
    }
}
