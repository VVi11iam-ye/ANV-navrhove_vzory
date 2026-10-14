package Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomDrinkTest {

    @Test
    void testCustomDrinkBuilder() {
        CustomDrink drink = new CustomDrink.Builder("coffee")
                .milk()
                .sugar()
                .build();

        assertNotNull(drink, "Nápoj by neměl být null");

        // Převedeme na malá písmena pro bezpečnou kontrolu obsahu
        String result = drink.toString().toLowerCase();

        assertTrue(result.contains("coffee"), "Nápoj by měl obsahovat kávu");
        assertTrue(result.contains("milk"), "Nápoj by měl obsahovat mléko");
        assertTrue(result.contains("sugar"), "Nápoj by měl obsahovat cukr");
    }
}