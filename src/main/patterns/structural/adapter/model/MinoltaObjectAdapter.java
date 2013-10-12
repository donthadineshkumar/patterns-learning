package patterns.structural.adapter.model;

/**
 * Date: 10/12/13
 * Time: 5:07 PM
 */
public class MinoltaObjectAdapter  implements Printable{
    private Minolta minolta = new Minolta();

    @Override
    public void print() {
        System.out.println(minolta.info() + " is being prepared for print ...");
    }

    @Override
    public String format(String pattern, String phrase) {
        minolta.preparePrinter();
        minolta.addText(String.format(pattern, phrase));
        String result = minolta.result();
        minolta.clearData();
        return result;
    }
}
