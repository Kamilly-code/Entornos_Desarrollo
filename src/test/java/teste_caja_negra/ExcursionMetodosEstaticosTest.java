package teste_caja_negra;
import ejercicio_caja_negra.ExcursionMetodosEstaticos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcursionMetodosEstaticosTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("precio alumno: 100 alumnos")
    void calcularPrecioAlumno1() {
        assertEquals(65, ExcursionMetodosEstaticos.calcularPrecioAlumno(100));
    }

    @Test
    @DisplayName("precio alumno: 50 alumnos")
    void calcularPrecioAlumno2() {
        assertEquals(70, ExcursionMetodosEstaticos.calcularPrecioAlumno(50));
    }

    @Test
    @DisplayName("precio alumno: 30 alumnos")
    void calcularPrecioAlumno3() {
        assertEquals(95, ExcursionMetodosEstaticos.calcularPrecioAlumno(30));
    }

    @Test
    @DisplayName("precio alumno: 29 alumnos")
    void calcularPrecioAlumno4() {
        assertEquals((4000/29), ExcursionMetodosEstaticos.calcularPrecioAlumno(29));
    }
    @Test
    @DisplayName("coste total: 100 alumnos")
    void calcularCosteExcursion1() {
        assertEquals(6500, ExcursionMetodosEstaticos.calcularCosteExcursion(100));
    }

    @Test
    @DisplayName("coste total: 50 alumnos")
    void calcularCosteExcursion2() {
        assertEquals(3500, ExcursionMetodosEstaticos.calcularCosteExcursion(50));
    }

    @Test
    @DisplayName("coste total: 30 alumnos")
    void calcularCosteExcursion3() {
        assertEquals(2850, ExcursionMetodosEstaticos.calcularCosteExcursion(30));
    }

    @Test
    @DisplayName("coste total: 29 alumnos")
    void calcularCosteExcursion4() {
        assertEquals(4000, ExcursionMetodosEstaticos.calcularCosteExcursion(29));
    }
}
