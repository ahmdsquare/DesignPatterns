
package Singleton;

public class Execute {

    public static void main(String[] args) {
        // MyClass object = MyClass.getObject();
        // MyClass object1 = MyClass.getObject();
        // MyClass object2 = MyClass.getObject();

        MyClass object = MyClass.getObject();
        MyClass object1 = MyClass.getObject();
        MyClass bahaa = MyClass.getObject();
        object.Print();
        object1.Print();
        object.Print();
        object1.Print();
        object.Print();

        System.out.println("Count: " + bahaa.count);

    }

}
