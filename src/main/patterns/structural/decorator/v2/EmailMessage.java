package patterns.structural.decorator.v2;

/**
 * Date: 10/19/13
 * Time: 12:07 PM
 */
public class EmailMessage implements Email {
    private String body;

    public EmailMessage(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return body;
    }

}
