public class OracleDB implements Database {
    @Override
    public void connect() {
        System.out.println("Oracle connect");
    }

    @Override
    public void execute() {
        System.out.println("Oracle execute");
    }
}
