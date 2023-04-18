public class MySQLDatabase implements Database{

    @Override
    public DatabaseFactory createFactory() {
        return new MySQLDatabaseFactory();
    }
}
