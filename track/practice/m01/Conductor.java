
public class Conductor {

    void collect(money m) {
        System.out.println("money collected by conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket isued");
        return t;
    }
}

class money {

}

class Ticket {

}
