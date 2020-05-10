package chapter04;

import common.Shape;
import io.reactivex.Observable;
import io.reactivex.Single;

public class Code_n36p161s01_AllFunctionExample {

    public static void main(String[] args) {
        String[] data = {"1", "2", "3", "4"};

        Single<Boolean> source = Observable.fromArray(data)
                .map(Shape::getShape)
                .all(Shape.BALL::equals);

        source.subscribe(System.out::println);
    }
}
