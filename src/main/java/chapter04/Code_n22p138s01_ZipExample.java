package chapter04;

import common.Log;
import common.Shape;
import io.reactivex.Observable;

public class Code_n22p138s01_ZipExample {

    public static void main(String[] args) {
        String[] shapes = {"BALL", "PENTAGON", "STAR"};
        String[] coloredTriangles = {"2-T", "6-T", "4-T"};

        Observable<String> source = Observable.zip(
                Observable.fromArray(shapes).map(Shape::getSuffix),
                Observable.fromArray(coloredTriangles).map(Shape::getColor),
                (suffix, color) -> color + suffix);

        source.subscribe(Log::i);
    }
}
