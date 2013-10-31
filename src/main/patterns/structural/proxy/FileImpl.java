package patterns.structural.proxy;

/**
 * Date: 10/31/13
 * Time: 10:26 AM
 */
public class FileImpl implements File {
    private String name;

    public FileImpl(String name) {
        this.name = name;
    }

    @Override
    public int size() {
        return name.length() * 17;
    }

    @Override
    public void delete() {
        System.out.println(String.format("%s Deleted", name));
    }

    @Override
    public void create() {
        System.out.println(String.format("%s Created", name));
    }

    @Override
    public String toString() {
        return name;
    }
}
