package chapter02;

import io.reactivex.Observable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class Code_n18p61s01_ObservableFromPublisher {

    public static void main(String[] args) {
        Publisher<String> publisher = new Publisher<String>() {
            @Override
            public void subscribe(Subscriber<? super String> s) {
                s.onNext("Hello Observable.fromPublisher()");
                s.onComplete();
            }
        };

        Observable<String> source = Observable.fromPublisher(publisher);
        source.subscribe(System.out::println);
    }
}
