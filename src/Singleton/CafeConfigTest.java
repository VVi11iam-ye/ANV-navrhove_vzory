package Singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeConfigTest {

    @Test
    void getInstance() {
        CafeConfig instance1 = CafeConfig.getInstance();
        CafeConfig instance2 = CafeConfig.getInstance();

        // Ověří, že obě proměnné ukazují na naprosto stejnou instanci v paměti
        assertSame(instance1, instance2, "Obě instance musí být identické");
    }

    @Test
    void getCafeName() {
        CafeConfig config = CafeConfig.getInstance();

        // Ověří, že metoda getCafeName() vrací správný název kavárny
        assertEquals("Smart Café", config.getCafeName(), "Název kavárny neodpovídá");
    }
}