package ejercicios.ejercicio2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio2Test {
    private static Ejercicio2 ejercicio2;
    @BeforeAll
    static void beforeAll() {
        ejercicio2 = new Ejercicio2();
    }

    @Test
    @DisplayName("#1")
    void testandoCasa1() {
        //Independente da letra maiscula ou minuscula
        assertEquals("valentia", ejercicio2.casasHogwart("Gryffindor"));
    }

    @Test
    @DisplayName("#2")
    void testandoCasa2() {
        //Independente da letra maiscula ou minuscula
        assertEquals("lealtad", ejercicio2.casasHogwart("Hufflepuff"));
    }

    @Test
    @DisplayName("#3")
    void testandoCasa3() {
        //Independente da letra maiscula ou minuscula
        assertEquals("astucia", ejercicio2.casasHogwart("Slytherin"));
    }

    @Test
    @DisplayName("#4")
    void testandoCasa4() {
        //Independente da letra maiscula ou minuscula
        assertEquals("intelecto", ejercicio2.casasHogwart("Ravenclaw"));
    }

    @Test
    @DisplayName("#5")
    void testandoCasa5() {
        //Independente da letra maiscula ou minuscula
        assertEquals("casa inexistente", ejercicio2.casasHogwart("Leganés"));
    }
}
