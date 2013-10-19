package patterns.structural.decorator;

/**
 * Date: 10/19/13
 * Time: 11:45 AM
 */
public abstract class PrinterDecorator implements Printer {
    private Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print();
    }
}
