package patterns.structural.adapter.impl;

import patterns.structural.adapter.Printable;

/**
 * Date: 10/12/13
 * Time: 4:52 PM
 */
public class HP implements Printable {
    @Override
    public void print() {
        System.out.println("HP prints ... ");
    }

    @Override
    public String format(String pattern, String phrase) {
        return String.format(pattern, phrase);
    }
}
