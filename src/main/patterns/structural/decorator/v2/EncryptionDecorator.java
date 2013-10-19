package patterns.structural.decorator.v2;

/**
 * Date: 10/19/13
 * Time: 12:22 PM
 */
public class EncryptionDecorator extends Decorator {

    private static final String DIVIDER = "-";

    public EncryptionDecorator(Email email) {
        super(email);
    }

    @Override
    public String getBody() {
        String body = email.getBody();
        StringBuilder result = new StringBuilder(body.length());
        for(byte b : body.getBytes()){
            result.append(b + 2);
            result.append(DIVIDER);
        }

        int lastIndex = result.lastIndexOf(DIVIDER);
        if(lastIndex != -1){
            result.deleteCharAt(lastIndex);
        }

        return result.toString();
    }
}
