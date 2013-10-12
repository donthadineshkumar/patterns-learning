package patterns.structural.adapter.impl;

import patterns.structural.adapter.Printable;

/**
 * Date: 10/12/13
 * Time: 5:02 PM
 */
public class MinoltaClassAdapter extends Minolta implements Printable {
    @Override
    public void print() {
        System.out.println(info() + " printing ... ");
    }

    @Override
    public String format(String pattern, String phrase) {
        preparePrinter();
        addText(String.format(pattern, phrase));
        String result = result();
        clearData();
        return result;
    }
}
