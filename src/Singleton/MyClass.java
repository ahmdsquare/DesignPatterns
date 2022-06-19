package Singleton;

public class MyClass {
    static MyClass instance;
    public int count = 0;

    private MyClass() {
    }

    public static MyClass getObject() {
        if (instance == null) {
            instance = new MyClass();
        }
        return instance;
    }
    // public static synchronized MyClass getObject() {
    // if (instance == null) {
    // instance = new MyClass();
    // }
    // return instance;
    // }

    void Print() {
        System.out.println("Hello From Print!");
        Counter();
    }

    void Counter() {
        count++;
    }
}
