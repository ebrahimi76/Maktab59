package hw6.hw6q1.product.electronic;

public class Televisions extends Electronic {
    private String resolotion;

    public Televisions(String name, String type, int size, String resolotion, int price) {
        super(name, type, size, price);
        this.resolotion = resolotion;
    }

    public String getResolotion() {
        return resolotion;
    }
}
