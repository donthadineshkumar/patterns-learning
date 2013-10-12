package patterns.structural.adapter.model;

/**
 * Date: 10/12/13
 * Time: 4:50 PM
 */
public interface Printable {
    void print();
    String format(String pattern, String phrase);
}
