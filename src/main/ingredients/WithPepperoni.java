package main.ingredients;

import main.Pizza;

public class WithPepperoni extends Ingredient {
    private int calories = 40;
    private double foodCost = 0.21;
    private double menuPrice = 0.50;

    public WithPepperoni(Pizza basePizza) {
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
