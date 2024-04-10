package junit5.aONE;

import one.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() { //no es necesario ser el mismo nombre porque estamos sobreescribiendo.
        assertEquals(8, Calculadora.sumar(4,4)); //Para comprovar se a o expect corresponde a suma.
    }

    @Test
    void resta(){
        assertEquals(-14000,Calculadora.disminuir(1000,15000));//assert son instrucciones
    }

    @Test
    void resta2(){
        assertEquals(-33,Calculadora.disminuir(-3,30));//assert son instrucciones
    }

    @Test
    void multiplicacion(){
        assertEquals(0,Calculadora.multiplicar(0,5));
    }
    @Test
    void multiplicacion2(){
        assertEquals(1000,Calculadora.multiplicar(1000,1));
    }

    @Test
    void division(){
        assertEquals(0,Calculadora.dividir(0,5));
    }
    @Test
    void division2(){
        assertEquals(0.1,Calculadora.dividir(1,10));
        //assertEquals (X esperado, X real) compara un resultado esperado con el resultado obtenido
    }



    /*
    ¿Qué son las pruebas unitarias en Java?
    Antes de comenzar a aprender JUnit en Java, repasemos brevemente qué es la prueba unitaria y por qué es tan popular (si ya conoce estas cosas, vaya a "¿Cómo escribo una prueba JUnit en Java?"). Las pruebas unitarias en Java hacen que el desarrollo de software a gran escala sea mucho más eficiente y sencillo. Puede ayudar tanto a las personas como a los equipos a reducir innumerables horas de depuración y agilizar enormemente el proceso de colaboración.
    */

    /*
    este @Teste encabezado especifica que la definición de función a continuación es de hecho una función de prueba que JUnit puede ejecutar por separado.
    */

}