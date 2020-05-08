package chapter02;

import io.reactivex.Single;

public class Code_n19p62s01_SingleExample {

    public static void main(String[] args) {
        Single<String> source = Single.just("Hello Single");
        source.subscribe(System.out::println);
    }
}
