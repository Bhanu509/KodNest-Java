
package topic6;

public class Student1 {

    String name;
    int age;
    double height;

    //properties of constructor
    //method name and student name must be same
    //no return type
    //category public by default
    Student1(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
