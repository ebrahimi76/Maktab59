package hw6.hw6q1;

public class Book {
    private String[] book = new String[2];

    public Book(String name, int price) {
        book[0] = String.valueOf(price);
        book[1] = name;
    }

    public String[] getBook() {
        return book;
    }
}
