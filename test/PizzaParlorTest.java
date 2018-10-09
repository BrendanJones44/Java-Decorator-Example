import main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PizzaParlorTest {
    private static final double DELTA = 1e-15;

    @Test
    public void createBasePizza() {
        Pizza pizza = new BasePizza();

        assertEquals("Total calories do not match!", 550,
                pizza.getCalories());
        assertEquals("Food cost does not match!", 2.29,
                pizza.getFoodCost(), DELTA);
        assertEquals("Menu price does not match!", 6.50,
                pizza.getTotalPrice(), DELTA);
    }
}
