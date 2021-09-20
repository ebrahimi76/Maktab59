package hw6.hw6q1.product.publish;

import hw6.hw6q1.product.Product;

public class Publish extends Product {

    public Publish(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Publish{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                "}";
    }
}
