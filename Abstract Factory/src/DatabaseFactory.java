public interface DatabaseFactory {
    Connection createConnection();
    Statement createStatement();
}
