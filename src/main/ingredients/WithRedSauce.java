package main.ingredients;

import main.Pizza;

public class WithRedSauce extends Ingredient {
    private int calories = 80;
    private double foodCost = 0.31;

    public WithRedSauce(Pizza basePizza) {
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
