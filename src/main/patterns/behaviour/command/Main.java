package patterns.behaviour.command;

/**
 * Date: 11/30/13
 * Time: 1:51 PM
 */
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();

        StartEngineCommand start = new StartEngineCommand(engine);
        StopEngineCommand stop = new StopEngineCommand(engine);

        EngineController engineController = new EngineController();

        engineController.setCommand(start);
        engineController.click();

        engineController.setCommand(stop);
        engineController.click();
    }
}
