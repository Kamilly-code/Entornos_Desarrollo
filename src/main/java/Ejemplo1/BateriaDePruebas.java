package Ejemplo1;

import java.util.Arrays;

public class BateriaDePruebas {
   private static String VALORENTRADA = "maria_p1l4r$$";

   private String getVALORENTRADA () {
       return VALORENTRADA;
   }

   private  void setVALORENTRADA (String valorentrada) {
       this.VALORENTRADA = valorentrada;
   }

   private static char [] letras;
   public boolean verificandoTamaño () {
        if (VALORENTRADA.length() >= 5 || VALORENTRADA.length() <= 15) {
            return true;
        }else return false;
   }

   public boolean verificandoCaracteres () {
        letras = VALORENTRADA.toCharArray();
            for (int i = 0; i < VALORENTRADA.length() ; i++) {
                if (!Character.isLetterOrDigit(letras[i]) && letras [i] != '-'){
                    return false;
                }
            }
        return true;
   }

   public boolean verificandoGuión () {
        letras = VALORENTRADA.toCharArray();
        if (VALORENTRADA.contains("-")) {
            if (VALORENTRADA.startsWith("-") || VALORENTRADA.endsWith("-")){
                return false;
            }
        }
        return true;
   }

   public boolean verificandoAlfabeto () {
            letras = VALORENTRADA.toCharArray();
            for (int i = 0; i < VALORENTRADA.length() ; i++) {
                if (Character.isAlphabetic(letras[i])){
                    return true;
                }
            }
            return false;
   }

   public boolean verificandoJava () {
            String[] palabrasReservadas = {
                    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                    "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
                    "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                    "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                    "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
            };

            return !Arrays.stream(palabrasReservadas).anyMatch(pr -> pr.equals(VALORENTRADA));
   }

   public boolean validarValor () {
        if (verificandoTamaño() && verificandoCaracteres() && verificandoGuión() && verificandoAlfabeto() && verificandoJava()) {
            return true;
        } else return false;}

    }


