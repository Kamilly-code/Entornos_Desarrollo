package Ejemplo1;

import org.junit.jupiter.api.*;

public class TestBateriaDePruebas {
    BateriaDePruebas bateriaDePruebas;

    @BeforeEach
    void setUp () {
        //remove her!
    }

    @AfterEach
    void tearDown () {
        //remove her!
    }

    @Test
    @DisplayName("Teste Unitario sobre el tamaño")
    public void testandoTamaño () {
       bateriaDePruebas = new BateriaDePruebas();
        System.out.println(bateriaDePruebas.getVALORENTRADA());
       Assertions.assertTrue(bateriaDePruebas.verificandoTamaño());
    }

    @Test
    @DisplayName("Teste Unitario sobre los caracteres")
    public void testandoCaracteres () {
        bateriaDePruebas = new BateriaDePruebas();
        //setIdentificador
        Assertions.assertTrue(bateriaDePruebas.verificandoCaracteres());
    }

    @Test
    @DisplayName("Teste Unitario sobre los guiones")
    public void testandoGuión () {
        bateriaDePruebas = new BateriaDePruebas();
        Assertions.assertTrue(bateriaDePruebas.verificandoGuión());
    }
    @Test
    @DisplayName("Teste unitario para ver si estan las letras en el alfabeto")
    public void testandoAlfabeto () {
        bateriaDePruebas = new BateriaDePruebas();
        Assertions.assertTrue(bateriaDePruebas.verificandoAlfabeto());
    }

    @Test
    @DisplayName("Teste unitario para ver si utilizamos algun comando java")
    public void testandoJava () {
        bateriaDePruebas = new BateriaDePruebas();
        Assertions.assertTrue(bateriaDePruebas.verificandoJava());
    }

    @Test
    @DisplayName("Teste automatizado ? De todo los anteriores")
    public void testandoTodo () {
        bateriaDePruebas = new BateriaDePruebas();
        Assertions.assertTrue(bateriaDePruebas.validarValor());
    }
}
