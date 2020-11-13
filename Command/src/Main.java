public class Main {
    public static void main(String[] args) {
        CommandQueue queue = new CommandQueue();

        queue.addCommand(new Command1());
        queue.addCommand(new Command2());
        queue.addCommand(new Command2());
        queue.addCommand(new Command1());

        queue.processRequests();
    }
}
