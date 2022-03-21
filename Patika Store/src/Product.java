import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Product extends AbstractBaseEntity {
    private double unitPrice;
    private double discount;
    private int stockAmount;
    private Brand brand;

    public Product(String name, double unitPrice, double discount, int stockAmount, Brand brand) {
        super(name);
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stockAmount = stockAmount;
        this.brand = brand;
    }

    public static void listProducts(ArrayList<Product> products) {
        System.out.println("\n*************Product Lists****************\n\n");

        List<Notebook> notebooks = (List<Notebook>) (List<?>) products.stream().filter(p -> p instanceof Notebook).toList();
        Notebook.printNotebooks(notebooks);

        List<MobilePhone> phones = (List<MobilePhone>) (List<?>) products.stream().filter(p -> p instanceof MobilePhone).toList();
        MobilePhone.printMobilePhones(phones);

    }

    public static void addProduct(ArrayList<Product> products) {
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("0 - Back");
            System.out.println("1 - Add Notebook");
            System.out.println("2 - Add Mobile Phone");
            System.out.print("Choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> flag = false;
                case 1 -> Notebook.addNotebook(products);
                case 2 -> MobilePhone.addMobilePhone(products);
                default -> System.out.println("Please enter a valid choice!");
            }
        }
    }

    public static void deleteProductById(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Product Id: ");
        int productId = scanner.nextInt();
        products.remove(getProductById(products,productId));
    }

    public static Product getProductById(ArrayList<Product> products, int productId) {
        return products.stream().filter(product -> product.getId() == productId).findAny().orElseThrow(() -> new RuntimeException("Product not found"));
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
