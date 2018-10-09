import main.*;
import main.ingredients.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PizzaParlorTest {
    private static final double DELTA = 1e-15;

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
}
