package junit5.catalogo;
import makingasJUnit5.catalogo.Pedido;
import makingasJUnit5.catalogo.Producto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PedidoTest {
    Producto p1, p2;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
        p1 = new Producto("Coco", 400);
        p2 = new Producto("Canela", 200);
    }

    @AfterEach
    void tearDown() {
        pedido.vaciar();
    }

    @Test
    void agregar() {
    }

    @Test
    @DisplayName("Pedido con 0 productos")
    void testCantidad1() {
        // vamos a probar que cuando el pedido está vacío la cantidad que devuelve es 0
        assertEquals(0,pedido.cantidad());
    }

    @Test
    @DisplayName("Pedido con 1 producto")
    void testCantidad2() {
        // para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        pedido.agregar(p1);

        assertEquals(1, pedido.cantidad());
    }

    @Test
    @DisplayName("Pedido con 2 productos")
    void testCantidad3() {
        // para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos

        pedido.agregar(p1);
        pedido.agregar(p2);

        assertEquals(2,pedido.cantidad());
    }

    @Test
    void total() {
    }

    @Test
    void vaciar() {
    }

    @Test
    void pagar() {
    }


}
