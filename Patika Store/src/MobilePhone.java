public class MobilePhone extends Product{

    private int storage;
    private double screenSize;
    private int camera;
    private double batteryPower;
    private int ram;
    private String color;

    public MobilePhone(String name, double unitPrice, double discount, int stockAmount, String productName, Brand brand, int storage, double screenSize, int camera, double batteryPower, int ram, String color) {
        super(name, unitPrice, discount, stockAmount, productName, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
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
