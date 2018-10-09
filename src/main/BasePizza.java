package main;

public class BasePizza implements Pizza {
    private int calories;
    private double foodCost;
    private double totalPrice;

    public BasePizza() {
        this.calories = 550;
        this.foodCost = 2.29;
        this.totalPrice = 6.50;
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
