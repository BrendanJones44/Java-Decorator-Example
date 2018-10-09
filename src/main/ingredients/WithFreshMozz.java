package main.ingredients;

import main.Pizza;

public class WithFreshMozz extends Ingredient {
    private int calories = 220;
    private double foodCost = 0.30;
    private double menuPrice = 0.00;

    public WithFreshMozz(Pizza basePizza) {
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
