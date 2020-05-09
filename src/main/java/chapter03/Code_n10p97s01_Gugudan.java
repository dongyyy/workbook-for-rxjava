package chapter03;

import common.Log;
import io.reactivex.Observable;

import java.util.Scanner;

public class Code_n10p97s01_Gugudan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());

        Observable<String> source = Observable.just(dan)
                .flatMap(gugu -> Observable.range(1, 9),
                        (gugu, i) -> gugu + " * " + i + " = " + gugu * i);
        source.subscribe(Log::d);
        in.close();
    }
}
