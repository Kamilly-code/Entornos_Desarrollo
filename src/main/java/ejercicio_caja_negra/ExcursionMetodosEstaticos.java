package ejercicio_caja_negra;

import java.util.Scanner;

public class ExcursionMetodosEstaticos {
    static Scanner teclado = new Scanner(System.in);
    public static double calcularPrecioAlumno (int numeroAlumnos) {
        double precio = 0;

        if (numeroAlumnos >= 100){
            precio = 65;
            System.out.println("Precio: " +precio);
            return precio;
        } else if (numeroAlumnos >= 50 && numeroAlumnos < 100) {
            precio = 70;
            System.out.println("Precio: " +precio);
            return precio;
        } else if (numeroAlumnos >= 30 && numeroAlumnos < 50) {
            precio = 95;
            System.out.println("Precio: " +precio);
            return precio;
        } else return 4000/numeroAlumnos;  //Desarrolar ese método
    };

    public static double calcularCosteExcursion (int numeroAlumnos) {
        if (numeroAlumnos >= 100) {
            return 65 * numeroAlumnos;
        } else if (numeroAlumnos >= 50 && numeroAlumnos < 100) {
            return 70 * numeroAlumnos;
        } else if (numeroAlumnos >= 30 && numeroAlumnos < 50) {
            return 95 * numeroAlumnos;
        } else return 4000;

    };
}
