package main.ingredients;

import main.Pizza;

public class WithBeef extends Ingredient {
    private int calories = 230;
    private double foodCost = 0.44;
    private double menuPrice = 1.00;

    public WithBeef(Pizza basePizza) {
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
