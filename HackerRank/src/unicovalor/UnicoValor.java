package unicovalor;

import java.util.List;

import java.util.ArrayList;

public class UnicoValor {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        System.out.println("Numeros de la lista: " + numeros);
        System.out.println("Numero unico: " + unicoValor(numeros));
    }

    public static int unicoValor(List<Integer> a) {
        ArrayList<Integer> uValor = new ArrayList<>();
        for (int n : a) {
            boolean res = uValor.contains(n);
            if (res == true) {
                uValor.remove(Integer.valueOf(n));
            } else {
                uValor.add(n);
            }
        }
        return uValor.get(0);
    }
}
