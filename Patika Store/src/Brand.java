import java.util.ArrayList;

public class Brand extends AbstractBaseEntity{

    private static ArrayList<Brand> brands = new ArrayList<>();
    public Brand(String name) {
        super(name);
    }

    public static void initBrands(){
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Monster"));
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Xiaomi"));
    }

    public static void printBrands() {
        brands.forEach(brand -> System.out.println("- "+brand.getName()));
    }

    public static Brand getBrandById(int brandChoice) {
        return brands.stream().filter(brand -> brand.getId() == brandChoice).findAny().orElseThrow(() -> new RuntimeException("Brand not found"));
    }
}
