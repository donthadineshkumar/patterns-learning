package patterns.structural.decorator.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date: 10/19/13
 * Time: 12:10 PM
 */
public class RemoveBadWordsDecorator extends Decorator {
    private static final List<String> badWords;

    static {
        badWords = Arrays.asList("fak", "shet");
    }

    public RemoveBadWordsDecorator(Email email) {
        super(email);
    }

    @Override
    public String getBody() {
        return removeBadWords(email.getBody());
    }

    private String removeBadWords(String content){
        for(String badWord : badWords){
            content = content.replaceAll(badWord, "***");
        }
        return content;
    }
}
