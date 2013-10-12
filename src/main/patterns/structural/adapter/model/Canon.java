package patterns.structural.adapter.model;

/**
 * Date: 10/12/13
 * Time: 4:53 PM
 */
public class Canon implements Printable {
    @Override
    public void print() {
        System.out.println("Canon is printing now ... ");
    }

    @Override
    public String format(String pattern, String phrase) {
        return pattern.replace("%s", phrase);
    }
}
