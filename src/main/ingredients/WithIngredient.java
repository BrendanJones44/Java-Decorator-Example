package main.ingredients;

import main.Pizza;

public class WithIngredient extends Ingredient {

    public WithIngredient(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCalories() {
        return super.getCalories();
    }

    @Override
    public double getFoodCost() {
        return super.getFoodCost();
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
