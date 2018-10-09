package main.ingredients;

import main.Pizza;

public class WithChicken extends Ingredient {
    private int calories = 140;
    private double foodCost = 0.56;
    private double menuPrice = 1.00;

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
