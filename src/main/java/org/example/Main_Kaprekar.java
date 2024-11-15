package org.example;

import java.util.*;

public class Main_Kaprekar {
    public static void main(String[] args) {

    }
    public static int kaprekarOp(int numero){
        String numtexto = String.valueOf(numero);
        int num1 = Integer.parseInt(ascendiente(numtexto));
        int num2 = Integer.parseInt(descendiente(numtexto));
        numero = num2-num1;
        return numero;
    }

    //Metodo itKaprekar creado para que no tengan problemas los test
    public static int itKaprekar(int numero){
        int contador = 0;
        while (numero != 6174){
            numero = kaprekarOp(numero);
            contador++;
        }
        return contador;
    }
    private static String descendiente(String numtexto) {
        char[] lista = numtexto.toCharArray();

        Arrays.sort(lista);
        String resultado = new StringBuilder(new String(lista)).reverse().toString();
        return resultado;
    }

    private static String ascendiente(String numtexto) {
        if(numtexto.length() <4){
            while(numtexto.length() <4) {
                numtexto = "0" + numtexto;
            }
        }
        char[] lista1 = numtexto.toCharArray();
        Arrays.sort(lista1);
        return new String(lista1);
    }

}