package ejercicio3;

/**
 * <h2>Clase Empleado, se utiliza para crear y leer empleados de una BD</h2>
 *
 * Busca información de javadoc en <a href="http://google.com">Google</a>
 *
 * @version 1-2014
 * @author ARM
 * @since 1-1-2014
 */
public class Empleado {

    /**
     * Atributo Nombre del empleado
     */
    private String nombre;

    /**
     * Atributo apellido del empleado
     */
    private String apellido;

    /**
     * Salario del empleado
     */
    private double salario;

    /**
     * Constructor con 3 parámetros.
     * Crea objetos empleado, con nombre, apellido y salario.
     *
     * @param nombre Nombre del empleado
     * @param apellido Apellido del empleado
     * @param salario Salario del empleado
     */
    public Empleado(String nombre, String apellido, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    /**
     * Sube el salario al empleado.
     *
     * @param subida Cantidad a subir el salario
     */
    public void subidasalario (double subida){
        salario=salario + subida;
    }

    /**
     * Comprueba que el nombre no este vacío
     *
     * @return <ul>
     * <li>true: el nombre no es una cadena vacía</li>
     * <li>false: el nombre es una cadena vacía</li>
     * </ul>
     */
    private boolean comprobar(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
}