package chapter04;

import common.Log;
import common.Utils;
import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

public class Code_n18p133s01_GroupByExample {

    public static void main(String[] args) {
        String[] objs = {"6", "4", "2-T", "2", "6-T", "4-T"};
        Observable<GroupedObservable<String, String>> source =
                Observable.fromArray(objs).groupBy(Utils::getShape);

        source.subscribe(obj -> {
            obj.subscribe(val -> Log.i("GROUP:" + obj.getKey() + "\t value:" + val));
        });
    }
}
