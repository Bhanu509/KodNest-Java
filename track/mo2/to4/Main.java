
public class Main {

    public static void main(String[] args) {
        Student1 scan = new Student1();
        scan.id = 101;
        scan.name = "Asha";
        scan.course = "java";
        scan.javaScore = 84.5;
        System.out.println("Student Profile");
        System.out.println(scan.id);
        System.out.println(scan.name);
        System.out.println(scan.course);
        System.out.println(scan.javaScore);
    }
}
