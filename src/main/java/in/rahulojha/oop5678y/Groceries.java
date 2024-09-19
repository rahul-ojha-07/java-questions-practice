package in.rahulojha.oop5678y;

import java.util.Date;

public class Groceries extends Product {
    private Date expirationDate;
    private double weight;
    private boolean isPerishable;
    private Nutrients nutrients;

    public Groceries(String id, String name, double price, int quantity, String manufacturer, Category category,
                     Date expirationDate, double weight, boolean isPerishable, Nutrients nutrients) {
        super(id, name, price, quantity, manufacturer, category);
        this.expirationDate = expirationDate;
        this.weight = weight;
        this.isPerishable = isPerishable;
        this.nutrients = nutrients;
    }

    public Groceries() {
        super();
        this.expirationDate = null;
        this.weight = 0;
        this.isPerishable = false;
        this.nutrients = new Nutrients();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isPerishable() {
        return isPerishable;
    }

    public void setPerishable(boolean isPerishable) {
        this.isPerishable = isPerishable;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }


    public void checkExpirationDate() {
        if (expirationDate != null) {
            if (expirationDate.before(new Date())) {
                System.out.println("Expired");
            } else {
                System.out.println("Not expired");
            }
        }
    }

    public void getNutritionalInfo() {
        System.out.println(nutrients);
    }


    public static class Nutrients {
        private double protein;
        private double fat;
        private double carbohydrates;
        private double energy;

        public Nutrients() {
            this.protein = 0;
            this.fat = 0;
            this.carbohydrates = 0;
            this.energy = 0;
        }

        public Nutrients(double protein, double fat, double carbohydrates, double energy) {
            this.protein = protein;
            this.fat = fat;
            this.carbohydrates = carbohydrates;
            this.energy = energy;
        }

        public double getProtein() {
            return protein;
        }

        public double getFat() {
            return fat;
        }

        public double getCarbohydrates() {
            return carbohydrates;
        }

        public double getEnergy() {
            return energy;
        }

        public void setProtein(double protein) {
            this.protein = protein;
        }

        public void setFat(double fat) {
            this.fat = fat;
        }

        public void setCarbohydrates(double carbohydrates) {
            this.carbohydrates = carbohydrates;
        }

        public void setEnergy(double energy) {
            this.energy = energy;
        }

        @Override
        public String toString() {
            return "Nutrients{" +
                    "protein=" + protein +
                    ", fat=" + fat +
                    ", carbohydrates=" + carbohydrates +
                    ", energy=" + energy +
                    '}';
        }
    }
}
