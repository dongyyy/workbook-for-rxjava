package chapter02;

import io.reactivex.Observable;

import java.util.HashSet;
import java.util.Set;

public class Code_n11p56s01_ObservableFromIterable {

    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Seoul");
        cities.add("London");
        cities.add("Paris");

        Observable<String> source = Observable.fromIterable(cities);
        source.subscribe(System.out::println);
    }
}
