package patterns.structural.decorator.v2;

/**
 * Date: 10/19/13
 * Time: 12:08 PM
 */
public abstract class Decorator implements Email  {
    protected Email email;

    protected Decorator(Email email) {
        this.email = email;
    }
}
