package hw6.hw6q1.product.electronic;

import hw6.hw6q1.product.Product;

public class Electronic extends Product {

    private String type;
    private int size;

    public Electronic(String name, String type, int size, int price) {
        super(name, price);
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
