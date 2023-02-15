public class Product {

    private int productId;
    private String name;
    private double price;
    private int number;

    public Product(int productId, int number) {
    }

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Product(int productId, String name, double price, int number) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.number = number;
        StockList.getStockList().save(Integer.toString(productId),Integer.toString(number));
    }

    public int getProductId() {
        return productId;
    }

    public void setId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setStock(int number) {
        this.number = number;
    }


}
