package patterns.behaviour.command;

/**
 * Date: 11/30/13
 * Time: 3:34 PM
 */
public class StartEngineCommand implements Command {
    private Engine engine;

    public StartEngineCommand(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.start();
    }
}
