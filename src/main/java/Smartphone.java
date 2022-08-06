public class Smartphone extends Product {
    private String prodName;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String prodName, String manufacturer) {
        super(id, name, price);
        this.prodName = prodName;
        this.manufacturer = manufacturer;
    }
}
