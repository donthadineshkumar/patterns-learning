package patterns.test;

import org.junit.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: BOB
 * Date: 9/21/13
 * Time: 11:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class BobTest {

    private static final int X = 233;

    @Test
    public void testX(){
        Bob bob = new Bob(X);

        assertEquals(X, bob.getX());

        //Set<Bob> set = Collections.
    }
}
