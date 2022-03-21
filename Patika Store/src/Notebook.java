public class Notebook extends Product{
    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(String name, double unitPrice, double discount, int stockAmount, String productName, Brand brand, int ram, int storage, double screenSize) {
        super(name, unitPrice, discount, stockAmount, productName, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
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
