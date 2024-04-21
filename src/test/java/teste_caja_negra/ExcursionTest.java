package teste_caja_negra;
import ejercicio_caja_negra.Excursion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExcursionTest {
    Excursion e;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("precio alumno: 100 alumnos") //@DisplayName("precio alumno: 100 alumnos"): Esta es otra anotación de JUnit que proporciona un nombre legible para la prueba. Este nombre se mostrará cuando se ejecute la prueba.
    void calcularPrecioAlumno1() {
        e = new Excursion(100); // instancio el objeto excursión con 100 alumnos
        assertEquals(65, e.calcularPrecioAlumno());
    }

    @Test
    void calcularCosteExcursion() {
    }
}
