package patterns.creational.multiton;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Simple multiton with Lazy Init.
 * Date: 10/5/13
 * Time: 2:40 PM
 */
public class Multiton {
    private static final Logger LOGGER = Logger.getLogger(Multiton.class.toString());

    private static final Map<String, Multiton> MULTITONS = new HashMap<String, Multiton>();

    private Multiton(){
    }

    public static Multiton getInstance(String key){
        Multiton instance = MULTITONS.get(key);
        if(instance == null){
            LOGGER.info(String.format("Constructing multiton for %s", key));
            synchronized (Multiton.class){
                if(MULTITONS.get(key)== null){
                    instance = new Multiton();
                    MULTITONS.put(key, instance);
                }
            }
        }
        return instance;
    }
}
