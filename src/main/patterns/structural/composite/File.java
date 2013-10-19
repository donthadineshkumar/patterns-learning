package patterns.structural.composite;

/**
 * Date: 10/19/13
 * Time: 11:05 AM
 */
public class File extends AbstractFileStructureElement {

    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(getType() + " = " + name);
    }

    @Override
    String getType() {
        return "FILE";
    }
}
