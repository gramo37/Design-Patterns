public class Client {
    public static void main(String[] args) {
        DatabaseType ip = DatabaseType.MONGO;
        Database db = new Database();
        Query q = db.createQuery(ip);
        q.executeQuery();
    }
}
