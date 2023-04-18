public class MongoDatabase implements Database{
    @Override
    public DatabaseFactory createFactory() {
        return new MongoDatabaseFactory();
    }
}
