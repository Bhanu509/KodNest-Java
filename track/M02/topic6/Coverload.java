
public class Coverload {

    String name;
    int age;
    double height;

    Coverload() {
        name = "Anu";
        age = 19;
        height = 5.0;
    }

    Coverload(String name) {
        this.name = name;
    }

    Coverload(String name, int age, double height) {
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
