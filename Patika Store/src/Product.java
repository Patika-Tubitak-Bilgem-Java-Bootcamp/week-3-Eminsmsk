public abstract class Product extends AbstractBaseEntity {
    private double unitPrice;
    private double discount;
    private int stockAmount;
    private String productName;
    private Brand brand;

    public Product(String name, double unitPrice, double discount, int stockAmount, String productName, Brand brand) {
        super(name);
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brand = brand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
