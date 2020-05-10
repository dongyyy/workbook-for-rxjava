package common;

import java.util.Random;

public class Utils {

    public static void exampleStart() {
        Log.exampleStart();
    }

    public static String getShape(String obj) {
        return Shape.getShape(obj);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() {
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
