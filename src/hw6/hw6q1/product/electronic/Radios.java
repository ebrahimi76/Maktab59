package hw6.hw6q1.product.electronic;

public class Radios extends Electronic {

    private String color;

    public Radios(String name, String type, int size, String color, int price) {
        super(name, type, size, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
