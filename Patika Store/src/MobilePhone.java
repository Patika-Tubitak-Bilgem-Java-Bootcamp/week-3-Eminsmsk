import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone extends Product {

    private int storage;
    private double screenSize;
    private int camera;
    private double batteryPower;
    private int ram;
    private String color;

    public MobilePhone(String name, double unitPrice, double discount, int stockAmount, Brand brand, int storage, double screenSize, int camera, double batteryPower, int ram, String color) {
        super(name, unitPrice, discount, stockAmount, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public static void printMobilePhones(List<MobilePhone> phones) {
        System.out.println("\n*************Mobile Phone List****************\n");
        String format = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Product Name                  | Price       | Brand     | Storage   | Camera    | Screen     | Battery       | RAM   | Color     |%n");
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        for (MobilePhone mobilePhone : phones) {
            System.out.format(format, mobilePhone.getId(), mobilePhone.getName(), mobilePhone.getUnitPrice() + "$", mobilePhone.getBrand().getName(), mobilePhone.getStorage(), mobilePhone.getCamera(), mobilePhone.getScreenSize(), mobilePhone.getBatteryPower(), mobilePhone.getRam(), mobilePhone.getColor());
        }
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
    }

    public static void addMobilePhone(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**Adding Mobile Phone**");
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
        System.out.print("Camera: ");
        int camera = scanner.nextInt();
        System.out.print("Battery Power: ");
        int battery = scanner.nextInt();
        System.out.print("RAM: ");
        int RAM = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.println("Brands: ");
        Brand.printBrands();
        System.out.print("Brand Choice: ");
        int brandChoice = scanner.nextInt();
        Brand brand = Brand.getBrandById(brandChoice);
        products.add(new MobilePhone(name,unitPrice,discount,stock, brand, storage, screenSize, camera, battery, RAM, color));
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

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
