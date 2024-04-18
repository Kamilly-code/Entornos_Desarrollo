package ejercicio_caja_negra;

import java.util.Scanner;

public class Excursion {
private int numeroAlumnos;

    public Excursion(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public double calcularPrecioAlumno () {
        if (numeroAlumnos >= 100) {
            return 65;
        } else if (numeroAlumnos >= 50 && numeroAlumnos < 100) {
            return 70;
        } else if (numeroAlumnos >= 30 && numeroAlumnos < 50) {
            return 95;
        } else {
            return 4000 / numeroAlumnos;
        }
    }

    public double calcularCosteExcursion (){
        if (numeroAlumnos >= 100){
            return 65* numeroAlumnos;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <100) {
            return 70*numeroAlumnos;
        } else if (numeroAlumnos >= 30 && numeroAlumnos < 50) {
            return 95* numeroAlumnos;
        }else {
            return 4000;
        }

    }

}
