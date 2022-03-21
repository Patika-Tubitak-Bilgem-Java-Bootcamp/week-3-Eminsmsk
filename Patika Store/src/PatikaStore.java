import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore {
    private final Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> products = new ArrayList<>();

    public void run() {
        Brand.initBrands();
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to Patika Store");
            System.out.println("0 - Exit");
            System.out.println("1 - Product Operations");
            System.out.println("2 - List Brands");
            System.out.print("Choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> flag = false;
                case 1 -> productOperations();
                case 2 -> Brand.printBrands();
                default -> System.out.println("Please enter a valid choice!");
            }
        }
        System.out.println("Goodbye!");

    }

    private void productOperations() {
        boolean flag = true;
        while (flag) {
            System.out.println("0 - Return Main");
            System.out.println("1 - List Products");
            System.out.println("2 - Add Product");
            System.out.println("3 - Delete Product");
            System.out.println("4 - Search Product");
            System.out.print("Choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> flag = false;
                case 1 -> Product.listProducts(products);
                case 2 -> Product.addProduct(products);
                case 3 -> Product.deleteProductById(products);
                //case 4 -> Product.searchProduct(products);
                default -> System.out.println("Please enter a valid choice!");
            }
        }
    }
}
