package main.ingredients;

import main.Pizza;

public class WithChicken extends Ingredient {
    private int calories = 210;
    private double foodCost = 0.39;
    private double menuPrice = 0.75;

    public WithChicken(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCalories() {
        return super.getCalories() + this.calories;
    }

    @Override
    public double getFoodCost() {
        return super.getFoodCost() + this.foodCost;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() + this.menuPrice;
    }

}
