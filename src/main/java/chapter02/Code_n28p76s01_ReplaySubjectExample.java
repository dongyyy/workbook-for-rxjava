package chapter02;

import io.reactivex.subjects.ReplaySubject;

public class Code_n28p76s01_ReplaySubjectExample {

    public static void main(String[] args) {
        ReplaySubject<String> subject = ReplaySubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();
    }
}
