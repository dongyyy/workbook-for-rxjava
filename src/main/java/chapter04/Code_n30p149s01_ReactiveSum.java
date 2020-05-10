package chapter04;

import common.Log;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.observables.ConnectableObservable;

import java.util.Scanner;

public class Code_n30p149s01_ReactiveSum {

    static class ReactiveSum {

        public void run() {
            ConnectableObservable<String> source = userInput();

            Observable<Integer> a = source
                    .filter(str -> str.startsWith("a:"))
                    .map(str -> str.replace("a:", ""))
                    .map(Integer::parseInt);

            Observable<Integer> b = source
                    .filter(str -> str.startsWith("b:"))
                    .map(str -> str.replace("b:", ""))
                    .map(Integer::parseInt);

            Observable.combineLatest(
                    a.startWith(0),
                    b.startWith(0),
                    (x, y) -> x + y)
                    .subscribe(res -> Log.i("Result: " + res));

            source.connect();
        }

        private ConnectableObservable<String> userInput() {
            return Observable.create((ObservableEmitter<String> emiiter) -> {
                Scanner in = new Scanner(System.in);
                while (true) {
                    Log.i("Input: ");
                    String line = in.nextLine();
                    emiiter.onNext(line);

                    if (line.indexOf("exit") >= 0) {
                        in.close();
                        break;
                    }
                }
            }).publish();
        }
    }

    public static void main(String[] args) {
        new ReactiveSum().run();
    }
}
