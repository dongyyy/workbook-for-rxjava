package chapter02;

import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;

public class Code_n24p70s02_AsyncSubjectExample {

    public static void main(String[] args) {
        Float[] temperature = {10.1f, 13.4f, 12.5f};
        Observable<Float> source = Observable.fromArray(temperature);

        AsyncSubject<Float> subject = AsyncSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));

        source.subscribe(subject);
    }
}
