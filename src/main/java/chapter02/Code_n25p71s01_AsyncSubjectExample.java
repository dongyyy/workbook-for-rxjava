package chapter02;

import io.reactivex.subjects.AsyncSubject;

public class Code_n25p71s01_AsyncSubjectExample {

    public static void main(String[] args) {
        AsyncSubject<Integer> subject = AsyncSubject.create();
        subject.onNext(10);
        subject.onNext(11);
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext(12);
        subject.onComplete();
        subject.onNext(13);
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.subscribe(data -> System.out.println("Subscriber #3 => " + data));
    }
}
