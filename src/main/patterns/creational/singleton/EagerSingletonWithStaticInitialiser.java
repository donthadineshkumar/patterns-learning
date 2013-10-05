package patterns.creational.singleton;

/**
 * Date: 10/5/13
 * Time: 1:48 PM
 */
public class EagerSingletonWithStaticInitialiser {
    private static EagerSingletonWithStaticInitialiser instance;

    static {
        instance = new EagerSingletonWithStaticInitialiser();
    }

    private EagerSingletonWithStaticInitialiser(){
    }

    public static EagerSingletonWithStaticInitialiser getInstance(){
        return instance;
    }
}
