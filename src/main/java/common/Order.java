package common;

public class Order {

    String id;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order ID: " + id;
    }
}
