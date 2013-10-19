package patterns.structural.decorator;

/**
 * Date: 10/19/13
 * Time: 11:47 AM
 */
public class PrinterSpaceDecorator extends PrinterDecorator {
    public PrinterSpaceDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print(" ");
        super.print();
    }
}
