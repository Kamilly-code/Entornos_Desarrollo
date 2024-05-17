package ejercicios.ejercicio2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

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
        //Esta técnica se utiliza comúnmente en las pruebas unitarias cuando el código que se está probando requiere la entrada del usuario. Permite la realización de pruebas automatizadas de código que de otra manera requeriría intervención manual.
        String forçarInput = "GRYFFINDOR";
        InputStream dentro = new ByteArrayInputStream(forçarInput.getBytes());
        System.setIn(dentro);
        //Independente da letra maiscula ou minuscula.
        assertEquals("valentia", ejercicio2.casasHogwart());
    }

    @Test
    @DisplayName("#2")
    void testandoCasa2() {
        //Para forçar um imput primeiro a gente cria um string com um valor determinado:
        String forçar = "hufflepuff";
        //Aqui a gente cria um Stream de entrada, com os dados anteriores. Tem que estanciar
        InputStream in = new ByteArrayInputStream(forçar.getBytes());
        System.setIn(in);

        assertEquals("lealtad",ejercicio2.casasHogwart());

    }

    @Test
    @DisplayName("#3")
    void testandoCasa3() {
        String forçar = "slytherin";
        InputStream in = new ByteArrayInputStream(forçar.getBytes());
        System.setIn(in);

        assertEquals("astucia",ejercicio2.casasHogwart());

    }

    @Test
    @DisplayName("#4")
    void testandoCasa4() {
        String forçar = "ravenclaw";
        InputStream in = new ByteArrayInputStream(forçar.getBytes());
        System.setIn(in);

        assertEquals("intelecto",ejercicio2.casasHogwart());

    }

    @Test
    @DisplayName("#5")
    void testandoCasa5() {
        String forçar = "casaInexistente";
        InputStream in = new ByteArrayInputStream(forçar.getBytes());
        System.setIn(in);

        assertEquals("casa inexistente",ejercicio2.casasHogwart());


    }
}
