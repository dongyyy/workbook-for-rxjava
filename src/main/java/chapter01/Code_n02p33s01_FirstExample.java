package chapter01;

import io.reactivex.Observable;

public class Code_n02p33s01_FirstExample {

    public void emit() {
        Observable.just("Hello", "RxJava 2!!")
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        Code_n02p33s01_FirstExample demo = new Code_n02p33s01_FirstExample();
        demo.emit();
    }
}
