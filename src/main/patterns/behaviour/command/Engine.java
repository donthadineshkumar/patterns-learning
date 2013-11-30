package patterns.behaviour.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Date: 11/30/13
 * Time: 3:32 PM
 */
public class Engine {
    private static final Logger LOGGER = LoggerFactory.getLogger(Engine.class);

    private boolean isRunning;

    public Engine() {
    }

    public void start(){
        isRunning = true;
        LOGGER.info("Engine started ...");
    }

    public void stop(){
        isRunning = false;
        LOGGER.info("Engine stopped ...");
    }
}
