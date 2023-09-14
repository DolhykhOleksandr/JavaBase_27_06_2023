package ua.hillel.dolhykh.homeworks.test;

public class MyClass {
    private String names;

    public MyClass(String names) {
        this.names = names;
    }

    public void printNames() {
        System.out.println(names);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Alice, Bob, Charlie");
        MyClass obj2 = new MyClass("David, Eve");

        obj1.printNames();
        obj2.printNames();
    }
}
//public class MyClass {
//    private String[] names;
//
//    public MyClass(String... names) {
//        this.names = names;
//    }
//
//    public void printNames() {
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }
//
//    public static void main(String[] args) {
//        MyClass obj1 = new MyClass("Alice", "Bob", "Charlie");
//        MyClass obj2 = new MyClass("David", "Eve");
//
//        obj1.printNames();
//        obj2.printNames();
//    }
//}
