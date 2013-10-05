package patterns.creational.multiton;

/**
 * Date: 10/5/13
 * Time: 3:20 PM
 */
public class Main {
    public static void main(String[] args) {
        Multiton.getInstance("Key1");
        Multiton.getInstance("Key2");
        Multiton.getInstance("Key2");
    }
}
