public class MySQLQuery implements Query{

    @Override
    public void createQuery() {
        System.out.println("Create My SQL Query");
    }

    @Override
    public void executeQuery() {
        System.out.println("Execute My SQL Query");
    }
}
