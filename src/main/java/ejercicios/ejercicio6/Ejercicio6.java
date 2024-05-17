package ejercicios.ejercicio6;

public class Ejercicio6 {
    public static boolean validarDni(String dni) {
        if (!comprovandoOsNumeros(dni)) {
            return false;
        } else if (!comprobandoLetras(dni)){
            return false;
        }
        return true;
    } // Una classe publica
    private static boolean comprovandoLogitud(String dni) {
        // Se vc for criar um Scanner, ou vor imitar o que seria um scanner no test, tem que escrever teclado.nextLine aqui, mas eu nao vou fazer assim.
        if (dni.length() == 9) {
            return true;
        } else return false;
    }

    private static boolean comprovandoOsNumeros(String dni) {
        if (!comprovandoLogitud(dni)){
            //Se o dni nao tiver 9 caracteres ja era, falso.
            return false;
        }
        for (int i = 0; i < dni.length() ; i++) {
            if (!Character.isDigit(dni.charAt(i))); // se for digito é um numero de 0-9; Aqui quando voce for fazer a verificacao de caracter vc tem que colocar charAt no final, pq se nao qual seria a utilidade de un for.

            return false; // COMPROVAMOS OS OITO CARACTERES PARA VER SE ERAM NUMEROS
        }

        if (!Character.isLetter(dni.charAt(dni.length() -1))) {
            return false; // AQUI DIZ QUE SE NAO CONTEM É FALSO, SO PARA COMPROVAR O ULTIMO CARACTER
        }

        //AQUI NO FINAL TA RETORNANDO VERDAIRO, DIZENDO QUE O DNI CONTEM LETRA Y NUMERO

    return true;
}

private static boolean comprobandoLetras (String dni) {
        String letra = dni.substring(8,9).toUpperCase();
        int numero = Integer.parseInt(dni.substring(0,8));
        switch (letra){
            case "T" -> {
                return numero % 23 == 0;
            }
            case "R" -> {
                return numero % 23 == 1;
            }
            case "W" -> {
                return numero % 23 == 2;
            }
            case "A" -> {
                return numero % 23 == 3;
            }
            case "G" -> {
                return numero % 23 == 4;
            }
            case "M" -> {
                return numero % 23 == 5;
            }
            case "Y" -> {
                return numero % 23 == 6;
            }
            case "F" -> {
                return numero % 23 == 7;
            }
            case "P" -> {
                return numero % 23 == 8;
            }
            case "D" -> {
                return numero % 23 == 9;
            }
            case "X" -> {
                return numero % 23 == 10;
            }
            case "B" -> {
                return numero % 23 == 11;
            }
            case "N" -> {
                return numero % 23 == 12;
            }
            case "J" -> {
                return numero % 23 == 13;
            }
            case "Z" -> {
                return numero % 23 == 14;
            }
            case "S" -> {
                return numero % 23 == 15;
            }
            case "Q" -> {
                return numero % 23 == 16;
            }
            case "V" -> {
                return numero % 23 == 17;
            }
            case "H" -> {
                return numero % 23 == 18;
            }
            case "L" -> {
                return numero % 23 == 19;
            }
            case "C" -> {
                return numero % 23 == 20;
            }
            case "K" -> {
                return numero % 23 == 21;
            }
            case "E" -> {
                return numero % 23 == 22;
            }
            default -> {
                return false;
            }
        }

}






}
