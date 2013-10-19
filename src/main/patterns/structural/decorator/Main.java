package patterns.structural.decorator;

import java.io.BufferedInputStream;

/**
 * Date: 10/19/13
 * Time: 11:23 AM
 */
public class Main {
    public static void main(String[] args) {
        PrinterDecorator d = new PrinterHelloDecorator(new PrinterCommaDecorator(new PrinterSpaceDecorator(new PrinterImpl())));
        d.print();
    }
}
