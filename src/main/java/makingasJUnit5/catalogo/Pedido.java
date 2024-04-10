package makingasJUnit5.catalogo;
import makingasJUnit5.pagos.ProveedorPagos;
import makingasJUnit5.pagos.PagoException;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Carrito,Pagable {
    private final List<Producto> productos = new ArrayList<>();


    @Override
    public void agregar(Producto p) {
        this.productos.add(p);
    }

    @Override
    public int cantidad() {
        return productos.size();
    }

    @Override
    public int total() {
        return this.productos.stream().map(Producto::getPrecio).reduce(0,Integer::sum);
    }

    @Override
    public void vaciar() {

    }

    @Override
    public void pagar(ProveedorPagos pagos) throws PagoException {

    }
    //Aquí, el método pagar puede lanzar una PagoException. Esto significa que cualquier clase que implemente Pagable debe manejar PagoException al implementar el método pagar.  Ahora, veamos cómo podemos implementar y usar throws en la clase Pedido que implementa Pagable:
    //UM EXEMPLO PARA QUE EU ENTENDA BEM:
    //    public void pagar(ProveedorPagos pagos) throws PagoException {
    //        if (total() > pagos.getSaldo()) {
    //            throw new PagoException("Saldo insuficiente para realizar el pago");
    //        }
    //        pagos.debitar(total());
    //    }
    //}

    //La sentencia throw se utiliza para lanzar explícitamente una excepción. En primer lugar, se debe obtener un descriptor de un objeto Throwable, bien mediante un parámetro en una cláusula catch o, se puede crear utilizando el operador new.




}
