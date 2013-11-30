package patterns.behaviour.command;

/**
 * Date: 11/30/13
 * Time: 3:34 PM
 */
public class StopEngineCommand implements Command {
    private Engine engine;

    public StopEngineCommand(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.stop();
    }
}
