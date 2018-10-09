import main.*;
import main.ingredients.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PizzaParlorTest {
    private static final double DELTA = 1e-15;

    private static final int CHEESE_PIZZA_CALORIES = 850;
    private static final double CHEESE_PIZZA_FOOD_COST = 2.90;
    private static final double CHEESE_PIZZA_PRICE = 6.50;

    @Test
    public void basePizza() {
        Pizza pizza = new BasePizza();

        assertEquals("Total calories do not match!", 550,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 2.29,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 6.50,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void tomatoPizza() {
        Pizza pizza = new WithRedSauce(new BasePizza());

        assertEquals("Total calories do not match!", 630,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 2.60,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 6.50,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void alfredoPizza() {
        Pizza pizza = new WithAlfredoSauce(new BasePizza());

        assertEquals("Total calories do not match!", 770,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 3.14,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 8.00,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void barbaquePizza() {
        Pizza pizza = new WithBarbaqueSauce(new BasePizza());

        assertEquals("Total calories do not match!", 690,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 2.76,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 7.25,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void whitePizza() {
        Pizza pizza = new WithShreddedMozz(new BasePizza());

        assertEquals("Total calories do not match!", 770,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 2.59,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 6.50,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void cheesePizza() {
        Pizza pizza = new WithShreddedMozz(new WithRedSauce(new BasePizza()));

        assertEquals("Total calories do not match!", CHEESE_PIZZA_CALORIES,
                pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void margheritaPizza() {
        Pizza pizza = new WithFreshMozz(new WithRedSauce(new BasePizza()));

        assertEquals("Total calories do not match!", 830,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 3.51,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 8.50,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void onionPizza() {
        Pizza pizza = new WithOnions(new WithShreddedMozz(
                new WithRedSauce(new BasePizza())));

        assertEquals("Total calories do not match!", CHEESE_PIZZA_CALORIES + 50,
                pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST + 0.19,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE + 0.50,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void peppersPizza() {
        Pizza pizza = new WithPeppers(new WithShreddedMozz(
                new WithRedSauce(new BasePizza())));

        assertEquals("Total calories do not match!", CHEESE_PIZZA_CALORIES + 40,
                pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST + 0.21,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE + 0.50,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void pepperoniPizza() {
        Pizza pizza = new WithPepperoni(new WithShreddedMozz(
                new WithRedSauce(new BasePizza())));

        assertEquals("Total calories do not match!",
                CHEESE_PIZZA_CALORIES + 160, pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST + 0.22,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE + 0.75,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void sausagePizza() {
        Pizza pizza = new WithSausage(new WithShreddedMozz(
                new WithRedSauce(new BasePizza())));

        assertEquals("Total calories do not match!",
                CHEESE_PIZZA_CALORIES + 210, pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST + 0.39,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE + 0.75,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void chickenPizza() {
        Pizza pizza = new WithChicken(new WithShreddedMozz(
                new WithRedSauce(new BasePizza())));

        assertEquals("Total calories do not match!",
                CHEESE_PIZZA_CALORIES + 140, pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST + 0.56,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE + 1.00,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void beefPizza() {
        Pizza pizza = new WithBeef(new WithShreddedMozz(
                new WithRedSauce(new BasePizza())));

        assertEquals("Total calories do not match!",
                CHEESE_PIZZA_CALORIES + 230, pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST + 0.44,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE + 1.00,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void bothCheesePizza() {
        Pizza pizza = new WithFreshMozz(new WithShreddedMozz(
                new WithRedSauce(new BasePizza())));

        assertEquals("Total calories do not match!",
                CHEESE_PIZZA_CALORIES + 200, pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST + 0.91,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE + 2.00,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void bbqChickenPizza() {
        Pizza pizza = new WithOnions(new WithChicken(new WithShreddedMozz(
                new WithBarbaqueSauce(new BasePizza()))));

        assertEquals("Total calories do not match!", 1100, pizza.getCalories());
        assertEquals("Food cost does not match!", 3.81,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 8.75,
                pizza.getTotalPrice(), DELTA);
    }
}
