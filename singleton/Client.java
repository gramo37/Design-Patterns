package singleton;

class MultithreadingDemo extends Thread {
    public SingleTon i;
    public MultithreadingDemo(SingleTon i) {
        this.i = i;
    }

    public void run()
    {
        try {
            this.i.connectToDatabase();
            this.i.executeQuery();
            
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class Client {
    public static void main(String[] args) {

        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();

        System.out.println(instance1.equals(instance2));
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            SingleTon s = SingleTon.getInstance();

            MultithreadingDemo object = new MultithreadingDemo(s);
            object.start();
        }
    }
}
