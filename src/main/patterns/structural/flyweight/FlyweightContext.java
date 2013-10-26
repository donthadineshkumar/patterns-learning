package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 10/26/13
 * Time: 1:19 PM
 */
public class FlyweightContext {
    private static final Map<String, DBContext> DB_CONTEXT_MAP = new HashMap<String, DBContext>();

    public static DBContext getDBContext(String key){
        DBContext context = DB_CONTEXT_MAP.get(key);

        if(context == null){
            context = new DBContext();
            DB_CONTEXT_MAP.put(key, context);
        }

        return context;
    }
}
