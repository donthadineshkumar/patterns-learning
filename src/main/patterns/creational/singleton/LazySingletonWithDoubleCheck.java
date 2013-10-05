package patterns.creational.singleton;

/**
 * Date: 10/5/13
 * Time: 1:45 PM
 */
public class LazySingletonWithDoubleCheck {
    private static LazySingletonWithDoubleCheck instance;

    private LazySingletonWithDoubleCheck(){
    }

    public static LazySingletonWithDoubleCheck getInstance(){
        if(instance == null){
            synchronized (LazySingletonWithDoubleCheck.class){
                if(instance == null){
                    instance = new LazySingletonWithDoubleCheck();
                }
            }
        }

        return instance;
    }

}
