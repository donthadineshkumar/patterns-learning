package patterns.creational.singleton;

/**
 * Date: 10/5/13
 * Time: 1:49 PM
 */
public class SingletonInnerClass {

    public static SingletonInnerClass getInstance(){
        return SingletonInner.instance;
    }

    private static class SingletonInner{
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }
}
