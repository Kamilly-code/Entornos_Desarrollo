package ejercicios.etc;

import java.util.stream.Stream;

public class otroEjercicio3 {
    public static int sumaFactorial (){
        return Stream.of(1,2,3,4,5,6,7,8,9,10).mapToInt(n -> n).sum();
    }

}
