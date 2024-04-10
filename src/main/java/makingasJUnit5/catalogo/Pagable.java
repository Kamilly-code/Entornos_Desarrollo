package makingasJUnit5.catalogo;
import makingasJUnit5.pagos.ProveedorPagos;
import makingasJUnit5.pagos.PagoException;

/*JUnit 5 es una revisión de JUnit actualizada a los nuevos tiempos. Incorpora soporte para versiones más recientes de Java y también se aprovecha de las mejoras incorporadas al lenguaje últimamente, como es el uso de los lambdas o una mejor arquitectura y un runner más actualizado.*/

public interface Pagable {
    void pagar(ProveedorPagos pagos) throws PagoException;
}
