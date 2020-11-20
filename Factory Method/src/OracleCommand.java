public class OracleCommand extends DBCommand {

    @Override
    public Database createConnection() {
        return new OracleDB();
    }
}
