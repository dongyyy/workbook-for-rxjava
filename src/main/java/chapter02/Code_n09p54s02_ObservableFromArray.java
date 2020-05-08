package chapter02;

import io.reactivex.Observable;

import java.util.stream.IntStream;

public class Code_n09p54s02_ObservableFromArray {

    private static Integer[] toIntegerArray(int[] intArray) {
        return IntStream.of(intArray).boxed().toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        int[] intArray = {400, 500, 600};
        Integer[] arr = toIntegerArray(intArray);
        Observable.fromArray(arr).subscribe(System.out::println);
    }
}


