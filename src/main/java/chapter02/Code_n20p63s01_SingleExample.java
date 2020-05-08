package chapter02;

import common.Order;
import io.reactivex.Observable;
import io.reactivex.Single;

public class Code_n20p63s01_SingleExample {

    public static void main(String[] args) {
        // 1. Single from Observable
        Observable<String> source = Observable.just("hello Single");
        Single.fromObservable(source).subscribe(System.out::println);

        // 2. Single from single()
        Observable.just("Hello Single")
                .single("default item")
                .subscribe(System.out::println);

        // 3. Single from first()
        String[] colors = {"Red", "Blue", "Gold"};
        Observable.fromArray(colors)
                .first("default value")
                .subscribe(System.out::println);

        // 4. Single from empty Observable
        Observable.empty()
                .single("default value")
                .subscribe(System.out::println);

        // 5. Single from take()
        Observable.just(new Order("ORD-1"), new Order("ORD-2"))
                .take(1)
                .single(new Order("default order"))
                .subscribe(System.out::println);
    }
}
