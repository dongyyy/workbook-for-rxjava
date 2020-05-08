package chapter02;

import io.reactivex.Observable;

public class Code_n01p45s01_FirstExample {

    public void emit() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        Code_n01p45s01_FirstExample demo = new Code_n01p45s01_FirstExample();
        demo.emit();
    }
}
