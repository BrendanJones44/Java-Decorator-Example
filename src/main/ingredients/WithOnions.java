package main.ingredients;

import main.Pizza;

public class WithOnions extends Ingredient {
    private int calories = 50;
    private double foodCost = 0.19;
    private double menuPrice = 0.50;

    public WithOnions(Pizza basePizza) {
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
