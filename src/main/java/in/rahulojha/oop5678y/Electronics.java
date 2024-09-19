package in.rahulojha.oop5678y;

public class Electronics extends Product {
    private String warrantyPeriod;
    private String powerUsage;
    private String brand;
    private int batteryLife;

    public Electronics(String id, String name, double price, int quantity, String manufacturer,
                       Category category, String warrantyPeriod, String powerUsage, String brand, int batteryLife) {
        super(id, name, price, quantity, manufacturer, category);
        this.warrantyPeriod = warrantyPeriod;
        this.powerUsage = powerUsage;
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    public Electronics() {
        super();
        this.batteryLife = 0;
        this.brand = null;
        this.powerUsage = null;
        this.warrantyPeriod = null;

    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(String powerUsage) {
        this.powerUsage = powerUsage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getWarrantyDetails() {
        return "Warranty Period: " + warrantyPeriod  + " Years";
    }

    public void powerOn() {
        System.out.println("Powering On");
    }
}
