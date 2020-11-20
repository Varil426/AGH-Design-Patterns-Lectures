public class MSSQLCommand extends DBCommand {
    @Override
    public Database createConnection() {
        return new MSSQLDB();
    }
}
