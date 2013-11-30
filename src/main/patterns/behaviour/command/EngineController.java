package patterns.behaviour.command;

/**
 * Date: 11/30/13
 * Time: 3:37 PM
 */
public class EngineController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
