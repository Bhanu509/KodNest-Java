
public class Main1 {

    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.student1id = 201;
        s2.student1name = "Asha";
        s2.student1javaScore = 82;
        s2.student2id = 202;
        s2.student2name = "Ravi";
        s2.student2javaScore = 85;

        System.out.print(s2.student1id + " - ");

        System.out.print(s2.student1name + " - ");

        System.out.println(s2.student1javaScore);

        System.out.print(s2.student2id + " - ");

        System.out.print(s2.student2name + " - ");

        System.out.println(s2.student2javaScore);
        if (s2.student1javaScore < s2.student2javaScore) {
            System.out.println(s2.student2name + " has the higher Java score");
        } else if (s2.student1javaScore > s2.student2javaScore) {
            System.out.println(s2.student1name + " has the higher Java score");
        } else {

            System.out.println("Both student have the same Java score");
        }

    }

}
