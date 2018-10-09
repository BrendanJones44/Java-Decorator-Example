package main.ingredients;

import main.Pizza;

public class WithShreddedMozz extends Ingredient {
    private int calories = 220;
    private double foodCost = 0.30;

    public WithShreddedMozz(Pizza basePizza) {
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

}
