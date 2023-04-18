public class MongoQuery implements Query{
    @Override
    public void createQuery() {
        System.out.println("Create Mongo Query");
    }

    @Override
    public void executeQuery() {
        System.out.println("Execute Mongo Query");
    }
}
