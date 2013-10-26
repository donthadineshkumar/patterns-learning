package patterns.structural.facade.model;

/**
 * Date: 10/26/13
 * Time: 11:37 AM
 */
public class Order {
    private int id;
    private String name;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
