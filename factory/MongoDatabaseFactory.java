public class MongoDatabaseFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MongoQuery();
    }
}
