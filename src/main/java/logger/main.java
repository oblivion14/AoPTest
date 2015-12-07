package logger;

/**
 * Created by Melvin on 2015. 12. 3..
 */
public class main {

    public static void main(String[] args) {

        test test = new test();

        try {
            test.ssd();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
