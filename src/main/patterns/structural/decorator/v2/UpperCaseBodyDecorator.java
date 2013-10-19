package patterns.structural.decorator.v2;

/**
 * Date: 10/19/13
 * Time: 12:19 PM
 */
public class UpperCaseBodyDecorator extends Decorator {

    public UpperCaseBodyDecorator(Email email) {
        super(email);
    }

    @Override
    public String getBody() {
        String body = email.getBody();
        if (body != null) {
            return body.toUpperCase();
        }
        return null;
    }

}
