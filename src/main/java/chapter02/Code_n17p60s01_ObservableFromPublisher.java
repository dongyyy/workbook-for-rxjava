package chapter02;

import io.reactivex.Observable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class Code_n17p60s01_ObservableFromPublisher {

    public static void main(String[] args) {
        Publisher<String> publisher = (Subscriber<? super String> s) -> {
            s.onNext("Hello Observable.fromPublisher()");
            s.onComplete();
        };

        Observable<String> source = Observable.fromPublisher(publisher);
        source.subscribe(System.out::println);
    }
}
