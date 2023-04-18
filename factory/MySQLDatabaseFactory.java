public class MySQLDatabaseFactory implements DatabaseFactory{

    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
