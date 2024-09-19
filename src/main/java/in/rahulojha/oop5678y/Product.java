package in.rahulojha.oop5678y;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;
    private Category category;

    public Product(String id, String name, double price, int quantity, String manufacturer, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public Product() {
        this.id = "0";
        this.name = null;
        this.price = 0;
        this.quantity = 0;
        this.manufacturer = null;
        this.category = Category.NONE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity +
                ", Manufacturer: " + manufacturer + ", Category: " + category;
    }

    public enum Category {
        ELECTRONIC, CLOTHING, GROCERIES, NONE
    }
}
