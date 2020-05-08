package chapter02;

import io.reactivex.subjects.AsyncSubject;

public class Code_n23p70s01_AsyncSubjectExample {

    public static void main(String[] args) {
        AsyncSubject<String> subject = AsyncSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();
    }
}
