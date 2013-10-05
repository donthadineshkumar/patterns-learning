package patterns.creational.singleton;

/**
 * Most simple singleton with Lazy Load.
 * Date: 10/5/13
 * Time: 1:42 PM
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
