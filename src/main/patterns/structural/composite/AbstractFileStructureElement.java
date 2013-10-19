package patterns.structural.composite;

/**
 * Date: 10/19/13
 * Time: 11:06 AM
 */
public abstract class AbstractFileStructureElement implements FileStructureElement {
    protected String name;

    public AbstractFileStructureElement(String name) {
        this.name = name;
    }

    abstract String getType();
}
