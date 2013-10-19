package patterns.structural.decorator;

/**
 * Date: 10/19/13
 * Time: 11:46 AM
 */
public class PrinterCommaDecorator extends PrinterDecorator {
    public PrinterCommaDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print(",");
        super.print();
    }
}
