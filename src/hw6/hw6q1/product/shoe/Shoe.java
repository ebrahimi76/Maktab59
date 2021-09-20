package hw6.hw6q1.product.shoe;

import hw6.hw6q1.product.Product;

public class Shoe extends Product {

    private int size;

    public Shoe(String name, int size, int price) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
