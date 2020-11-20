public class MSSQLDB implements Database {
    @Override
    public void connect() {
        System.out.println("MSSQL connect");
    }

    @Override
    public void execute() {
        System.out.println("MSSQL execute");
    }
}
