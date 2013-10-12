package patterns.structural.adapter;

import patterns.structural.adapter.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 10/12/13
 * Time: 4:43 PM
 */
public class Main {
    public static void main(String[] args) {
        List<Printable> printers = new ArrayList<Printable>();
        printers.add(new Canon());
        printers.add(new HP());
        printers.add(new MinoltaClassAdapter());
        printers.add(new MinoltaObjectAdapter());
        //printers.add(new Minolta()); //needs to be adapted

        for(Printable printer : printers){
            printer.print();
            System.out.println(printer.format("Hello, %s", printer.getClass().getName()));
        }
    }
}
