public class Database {
    public Query createQuery(DatabaseType ip) {
        if(ip == DatabaseType.SQL) {
            return new MySQLQuery();
        }
        else if(ip == DatabaseType.MONGO){
            return new MongoQuery();
        }
        return new DefaultQuery();
    }
}
