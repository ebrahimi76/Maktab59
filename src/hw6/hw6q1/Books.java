package hw6.hw6q1;

public class Books extends Book{
    private int pages;
    private String author;

    public Books(String name, String author,int page, int price) {
        super(name,  price);
        this.author = author;
        this.pages = page;
    }
}
