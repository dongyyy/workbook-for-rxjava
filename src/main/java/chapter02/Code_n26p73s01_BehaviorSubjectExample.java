package chapter02;

import io.reactivex.subjects.BehaviorSubject;

public class Code_n26p73s01_BehaviorSubjectExample {

    public static void main(String[] args) {
        BehaviorSubject<String> subject = BehaviorSubject.createDefault("6");
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();
    }
}
