public class Client {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        DatabaseFactory dbf = db.createFactory();
        Query q = dbf.createQuery();
        q.createQuery();
        q.executeQuery();
    }
}
