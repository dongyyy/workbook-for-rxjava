package chapter02;

import io.reactivex.Observable;

public class Code_n08p54s01_ObservableFromArray {

    public static void main(String[] args) {
        int[] intArray = {400, 500, 600};
        /** int array is one of wrong case at rxjava **/
        Observable.fromArray(intArray).subscribe(System.out::println);
    }
}
