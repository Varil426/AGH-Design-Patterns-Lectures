import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
    List<Command> queue = new ArrayList<>();

    public void addCommand(Command command) {
        queue.add(command);
    }

    public void processRequests() {
        for(Command command : queue) {
            command.execute();
        }
    }
}
