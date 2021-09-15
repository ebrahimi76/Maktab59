package hw6.hw6q1;

public class Shoe {

    private String[] shoe = new String[3];

    public Shoe(String name, int size, int price) {
        shoe[0] = String.valueOf(price);
        shoe[1] = name;
        shoe[2] = String.valueOf(size);
    }

}
