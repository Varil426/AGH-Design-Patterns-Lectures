public class Main {
    public static void main(String[] args) {
        DatabaseFactory factory = new OracleFactory();
        Connection connection = factory.createConnection();
        Statement statement = factory.createStatement();
    }
}
