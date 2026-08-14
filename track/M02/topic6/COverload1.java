
public class COverload1 {

    public static void main(String[] args) {
        Coverload c1 = new Coverload();
        c1.display();

        Coverload c2 = new Coverload("bhanu");
        c2.display();

        Coverload c3 = new Coverload("bhanu", 21, 5.9);
        c3.display();
    }

}
