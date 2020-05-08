package chapter02;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class Code_n03p49s01_ObservableCreateExample {

    public static void main(String[] args) {
        Observable<Integer> source = Observable.create(
                (ObservableEmitter<Integer> emitter) -> {
                    emitter.onNext(100); // explicit call this
                    emitter.onNext(200); // explicit call this
                    emitter.onNext(300); // explicit call this
                    emitter.onComplete(); // explicit call this
                });

        source.subscribe(System.out::println);
    }
}
