package singleton;

public class SingleTon {
    private SingleTon() {}
    private static SingleTon instance;

    private static SingleTon demo = new SingleTon();

    public void connectToDatabase() {
        System.out.println("Connected to DB");
    }

    public void executeQuery() {
        System.out.println("Query executed");
    }
    public static SingleTon getInstance() {
        if(instance == null) {
            synchronized (demo) {
                if(instance == null) {
                    instance =  new SingleTon();
                }
            }
        }
        return instance;
    }
}
