package main;

public class BasePizza implements Pizza {
    private int calories;
    private double foodCost;
    private double totalPrice;

    public BasePizza() {
        this.calories = 0;
        this.foodCost = 0.0;
        this.totalPrice = 0.0;
    }

    public int getCalories() {
        return this.calories;
    }

    public double getFoodCost() {
        return this.foodCost;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
}
