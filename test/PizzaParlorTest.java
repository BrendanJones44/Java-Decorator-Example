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
        Pizza pizza = new WithSauce(new BasePizza());

        assertEquals("Total calories do not match!", 630,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 2.60,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 6.50,
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
        Pizza pizza = new WithShreddedMozz(new WithSauce(new BasePizza()));

        assertEquals("Total calories do not match!", CHEESE_PIZZA_CALORIES,
                pizza.getCalories());
        assertEquals("Food cost does not match!", CHEESE_PIZZA_FOOD_COST,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", CHEESE_PIZZA_PRICE,
                pizza.getTotalPrice(), DELTA);
    }

    @Test
    public void margheritaPizza() {
        Pizza pizza = new WithFreshMozz(new WithSauce(new BasePizza()));

        assertEquals("Total calories do not match!", 750,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 3.51,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 8.50,
                pizza.getTotalPrice(), DELTA);
    }
}
