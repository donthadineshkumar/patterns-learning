package patterns.creational.singleton;

/**
 * Most simple singleton with Eager Load.
 * Date: 10/5/13
 * Time: 1:44 PM
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
