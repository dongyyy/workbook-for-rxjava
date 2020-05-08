package chapter02;

import io.reactivex.Observable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Code_n16p59s02_ObservableFromFuture {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<String> future = service.submit(() -> {
            Thread.sleep(1000);
            return "Hello Future";
        });

        Observable<String> source = Observable.fromFuture(future);
        source.subscribe(System.out::println);

        service.shutdown();
    }
}
