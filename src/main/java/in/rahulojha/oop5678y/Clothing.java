package in.rahulojha.oop5678y;

import java.util.Arrays;

public class Clothing extends Product {
    private Size size;
    private String color;
    private String material;
    private String brand;
    private String gender;

    public Clothing(String id, String name, double price, int quantity, String manufacturer, Category category,
                    Size size, String color, String material, String brand, String gender) {
        super(id, name, price, quantity, manufacturer, category);
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.gender = gender;
    }

    public Clothing() {
        super();
        this.size = null;
        this.color = null;
        this.material = null;
        this.brand = null;
        this.gender = null;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSizeChart() {
        return Arrays.stream(Size.values()).toList().toString();
    }

    public void getRecommendedWashingInstructions() {
        if (this.material.equals("cotton") || this.material.equals("polyester")) {
            System.out.println("Wash in cold water");
        } else {
            System.out.println("Wash in normal water");
        }
    }



    public enum Size {
        S, M, L, XL, XXL

    }
}
