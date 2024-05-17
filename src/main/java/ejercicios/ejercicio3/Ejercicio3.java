package ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ejercicio3 {
    public static int sumaDeUnoHastaDiez (){
        return Stream.of(1,2,3,4,5,6,7,8,9,10).mapToInt(n-> n).sum();
        //Map to Int, passa os numeros para Int através de Lambda;
       /* List<Integer> numeros = new ArrayList<>();
        numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);*/
    }
}
