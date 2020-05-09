package chapter03;

import common.Log;
import io.reactivex.Observable;

import java.util.Scanner;

public class Code_n09p95s01_Gugudan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());

        Observable<String> source = Observable.just(dan).flatMap(num ->
                Observable.range(1, 9).map(row -> num + " * " + row + " = " + dan * row));
        source.subscribe(Log::d);
        in.close();
    }
}
