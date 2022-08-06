import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ProductManagerTest {
    Book book1 = new Book(
            1,
            "Книга 1",
            300,
            "Пушкин",
            "Русалка"
    );
    Book book2 = new Book(
            2,
            "Книга 2",
            500,
            "Достоевский",
            "Идиот"
    );
    Smartphone smart1 = new Smartphone(
            3,
            "Тел 1",
            1000,
            "Iphone",
            "Apple"
    );

    Product item1 = new Product(11, "Один", 100);
    Product item2 = new Product(12, "Два", 200);
    Product item3 = new Product(13, "Три", 300);

    Repository repo = new Repository();


}
