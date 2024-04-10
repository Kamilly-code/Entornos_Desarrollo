package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pido un numero
        int numero = teclado.nextInt(); teclado.nextLine();
        //si es distinto de 0, entro en bucle y solo salgo si for 0
        while (numero!=0){
            String cadena = teclado.nextLine();
            String[] numeros = cadena.split(" ");
            System.out.println(Arrays.toString(numeros));

            //Antes de salir tendo que pedir un nuevo numero
            numero = teclado.nextInt(); teclado.nextLine();

        }
    }
}
