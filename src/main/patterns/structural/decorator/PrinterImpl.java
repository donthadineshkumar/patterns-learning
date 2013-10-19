package patterns.structural.decorator;

/**
 * Date: 10/19/13
 * Time: 11:44 AM
 */
public class PrinterImpl implements Printer {
    @Override
    public void print() {
        System.out.print("World!");
    }
}
