package hw6.hw6q1;

public class Magazines extends Book {
    private int version;
    private String company;
    public Magazines(String name, String company,int version, int price) {
        super(name,  price);
        this.version = version;
        this.company = company;
    }
}

