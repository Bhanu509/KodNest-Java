
class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;

    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);

    }
}
