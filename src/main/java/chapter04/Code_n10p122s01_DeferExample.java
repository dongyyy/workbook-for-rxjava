package chapter04;

import common.Log;
import common.MarbleDiagram;
import common.Shape;
import io.reactivex.Observable;

import java.util.Arrays;
import java.util.Iterator;

public class Code_n10p122s01_DeferExample implements MarbleDiagram {

    private Iterator<String> colors = Arrays.asList("RED", "ORANGE", "YELLOW", "GREEN").iterator();

    @Override
    public void marbleDiagram() {
        Observable<String> source = getObservable();
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
        new Code_n10p122s01_DeferExample().marbleDiagram();
    }
}
