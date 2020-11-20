public abstract class DBCommand {
    Database database;
    public abstract Database createConnection();
    public void executeCommand() {
        database = this.createConnection();
        database.connect();
        database.execute();
    }
}
