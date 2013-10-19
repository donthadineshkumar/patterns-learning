package patterns.structural.decorator.v2;

/**
 * Date: 10/19/13
 * Time: 12:06 PM
 */
public class Main {
    public static void main(String[] args) {
        Email email = new EncryptionDecorator(new UpperCaseBodyDecorator(new RemoveBadWordsDecorator(new EmailMessage("fak shet was killed"))));
        System.out.println(email.getBody());
    }
}
