package ejercicios.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public String casasHogwart() {
        Scanner teclado = new Scanner(System.in);
        String casa = teclado.nextLine();
        //Se pedia por teclado.
        switch (casa.toLowerCase()) {
            case "gryffindor":
                System.out.println("valentia");
                return "valentia";
            case "hufflepuff":
                System.out.println("lealtad");
                return "lealtad";
            case "slytherin":
                System.out.println("astucia");
                return "astucia";
            case "ravenclaw":
                System.out.println("intelecto");
                return "intelecto";
            default:
                System.out.println("casa inexistente");
                return "casa inexistente"; //Nesse caso a gente nao utiliza o break:
        }
    }

}
