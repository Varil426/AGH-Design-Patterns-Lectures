public abstract class DataBaseFactory {
    public static Database createDataBase(int type) throws Exception {
        switch (type) {
            case 0:
                return new OracleDB();
            case 1:
                return new MongoDB();
            case 2:
                return new MSSQLDB();
            default:
                throw new Exception("Bad parameter");
        }
    }
}
