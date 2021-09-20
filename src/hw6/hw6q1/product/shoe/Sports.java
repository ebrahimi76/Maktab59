package hw6.hw6q1.product.shoe;

public class Sports extends Shoe {

    private String used;

    public Sports(String name, int size, String used, int price) {
        super(name, size, price);
        this.used = used;
    }

    public String getUsed() {
        return used;
    }
}
