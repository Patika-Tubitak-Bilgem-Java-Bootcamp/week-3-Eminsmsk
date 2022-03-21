import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product {
    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(String name, double unitPrice, double discount, int stockAmount, Brand brand, int ram, int storage, double screenSize) {
        super(name, unitPrice, discount, stockAmount, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public static void printNotebooks(List<Notebook> notebooks) {
        System.out.println("\n*************Notebook List****************\n");
        String format = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-5d |%n";
        System.out.format("---------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Product Name                  | Price       | Brand     | Storage   | Screen     | RAM   |%n");
        System.out.format("---------------------------------------------------------------------------------------------%n");
        for (Notebook notebook : notebooks) {
            System.out.format(format, notebook.getId(), notebook.getName(), notebook.getUnitPrice() + "$", notebook.getBrand().getName(), notebook.getStorage(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.format("---------------------------------------------------------------------------------------------%n");
    }

    public static void addNotebook(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**Adding Notebook**");
        System.out.print("Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Discount: ");
        double discount = scanner.nextDouble();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        System.out.print("RAM: ");
        int RAM = scanner.nextInt();
        System.out.println("Brands: ");
        Brand.printBrands();
        System.out.print("Brand Choice: ");
        int brandChoice = scanner.nextInt();
        Brand brand = Brand.getBrandById(brandChoice);
        products.add(new Notebook(name, unitPrice, discount, stock, brand, RAM, storage, screenSize));
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
