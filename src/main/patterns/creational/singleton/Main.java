package patterns.creational.singleton;

/**
 * Date: 10/5/13
 * Time: 2:13 PM
 */
public class Main {
    public static void main(String[] args) {
        EagerSingleton.getInstance();

        EagerSingletonWithStaticInitialiser.getInstance();

        LazySingleton.getInstance();

        LazySingletonWithDoubleCheck.getInstance();

        SingletonInnerClass.getInstance();
    }
}
