public class MongoCommand extends DBCommand {
    @Override
    public Database createConnection() {
        return new MongoDB();
    }
}
