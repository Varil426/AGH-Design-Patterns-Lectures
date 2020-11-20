public class Main {
    public static void main(String[] args) throws Exception {
        Database db = DataBaseFactory.createDataBase(1);
        db.connect();
        db.execute();
    }
}
