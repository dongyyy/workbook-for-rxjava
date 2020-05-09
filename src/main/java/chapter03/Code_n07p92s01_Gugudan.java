package chapter03;

import common.Log;
import io.reactivex.Observable;

import java.util.Scanner;

public class Code_n07p92s01_Gugudan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());
        Observable<Integer> source = Observable.range(1, 9);
        source.subscribe(row -> Log.d(dan + " * " + row + " = " + dan * row));
        in.close();
    }
}
