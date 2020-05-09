package chapter03;

import common.Log;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

import java.util.Scanner;

public class Code_n08p93s01_Gugudan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());

        Function<Integer, Observable<String>> gugudan = num ->
                Observable.range(1, 9).map(row -> num + " * " + row + " = " + dan * row);

        Observable<String> source = Observable.just(dan).flatMap(gugudan);
        source.subscribe(Log::d);
        in.close();
    }
}
