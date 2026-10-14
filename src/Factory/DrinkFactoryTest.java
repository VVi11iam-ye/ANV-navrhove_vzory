package Factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DrinkFactoryTest {

    @Test
    void testCreateTea() {
        Drink drink = DrinkFactory.createDrink("tea");
        assertNotNull(drink, "Čaj by neměl být null");
        assertEquals("Serving Tea", drink.serve());
    }

    @Test
    void testCreateCoffee() {
        Drink drink = DrinkFactory.createDrink("coffee");
        assertNotNull(drink, "Káva by neměla být null");
        assertEquals("Serving Coffee", drink.serve());
    }

    @Test
    void testCreateUnknownDrink() {
        Drink drink = DrinkFactory.createDrink("water");
        assertNull(drink, "Neznámý nápoj by měl vrátit null");
    }
}