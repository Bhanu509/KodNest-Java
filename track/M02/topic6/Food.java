
class Food {

    String item;
    int quantity;

    Food(String item) {
        this.item = item;
        this.quantity = 1;

    }

    Food(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;

    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);

    }
}
