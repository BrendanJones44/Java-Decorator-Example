package main.ingredients;

import main.*;

abstract public class Ingredient implements Pizza {
    private Pizza basePizza;

    public Ingredient(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    public int getCalories() {
        return this.basePizza.getCalories();
    }

    public double getFoodCost() {
        return this.basePizza.getFoodCost();
    }

    public double getTotalPrice() {
        return this.basePizza.getTotalPrice();
    }
}

