package com.test;

public class Invertir {
    public String invertirCadena(String cadenaInvertida){
        StringBuilder sb = new StringBuilder(cadenaInvertida);
        cadenaInvertida = sb.reverse().toString();
        return cadenaInvertida;
    }
}
