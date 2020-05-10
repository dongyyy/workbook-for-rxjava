package chapter04;

import common.Log;
import common.MarbleDiagram;
import common.Shape;
import common.Utils;
import io.reactivex.Observable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Code_n09p120s01_DeferExample implements MarbleDiagram {

    private Iterator<String> colors = Arrays.asList("RED", "ORANGE", "YELLOW", "GREEN").iterator();

    @Override
    public void marbleDiagram() {
        Callable<Observable<String>> supplier = () -> getObservable();
        Observable<String> source = Observable.defer(supplier);

        source.subscribe(val -> Log.i("Subscriber #1:" + val));
        source.subscribe(val -> Log.i("Subscriber #2:" + val));
        Log.exampleComplete();
    }

    private Observable<String> getObservable() {
        if (colors.hasNext()) {
            String color = Shape.getColor(colors.next());
            return Observable.just(
                    Shape.getString(color, Shape.BALL),
                    Shape.getString(color, Shape.RECTANGLE),
                    Shape.getString(color, Shape.PENTAGON));
        }

        return Observable.empty();
    }

    public static void main(String[] args) {
        new Code_n09p120s01_DeferExample().marbleDiagram();
    }
}
