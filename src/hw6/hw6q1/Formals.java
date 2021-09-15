package hw6.hw6q1;

public class Formals extends Shoe {
    private String type;

    public Formals(String name, int size, String type, int price) {
        super(name, size, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
