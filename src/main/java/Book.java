public class Book extends Product {
    private String author;
    private String title;

    public Book(int id, String name, int price, String author, String title) {
        super(id, name, price);
        this.author = author;
        this.title = title;
    }
}
