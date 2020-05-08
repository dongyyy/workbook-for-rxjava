package chapter02;

import io.reactivex.Observable;

import java.util.concurrent.Callable;

public class Code_n15p59s01_ObservableFromCallable {

    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Hello Callable";
            }
        };

        Observable<String> source = Observable.fromCallable(callable);
        source.subscribe(System.out::println);
    }
}
