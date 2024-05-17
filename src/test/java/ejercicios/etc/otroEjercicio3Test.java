package ejercicios.etc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class otroEjercicio3Test {
    @Test
    @DisplayName("Testando para ver se da 55")
    void testandoLaSuma() {
        assertEquals(55, otroEjercicio3.sumaFactorial());
    }
}
