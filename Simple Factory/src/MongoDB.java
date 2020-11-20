public class MongoDB implements Database {
    @Override
    public void connect() {
        System.out.println("Mongo connect");
    }

    @Override
    public void execute() {
        System.out.println("Mongo execute");
    }
}
