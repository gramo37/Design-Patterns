import java.util.HashMap;

public class Registry {
    private HashMap<String, Student> registry = new HashMap<>();
    private Registry() {};
    private static Registry instance;
    private static Registry demo = new Registry();

    public static Registry getInstance() {
        if(instance == null) {
            synchronized (demo) {if(instance == null) instance = new Registry();}
        }
        return instance;
    }

    public void register(String key, Student s) {
        registry.put(key, s);
    }

    public Student get(String key) {
        return registry.get(key);
    }

}
