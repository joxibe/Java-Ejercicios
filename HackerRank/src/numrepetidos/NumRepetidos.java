package numrepetidos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumRepetidos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(1);
        numeros.add(4);
        numeros.add(15);
        numeros.add(6);
        numeros.add(4);
        numeros.add(6);
        numeros.add(4);
        numeros.add(4);
        numeros.add(1);
        
        System.out.println(coutingSort(numeros));
        
    }
    
    public static List<Integer> coutingSort(List<Integer> arr){
        List<Integer> nRepetidos = new ArrayList<>();
        Collections.sort(arr);
        int nBuscar = arr.get(0);
        System.out.println(arr);
        int contador = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(nBuscar == arr.get(i)){
                contador++;
            }
            else{
                contador--;
                nRepetidos.add(contador);
                contador = 1;
                nBuscar = arr.get(i);
            }
        }
        nRepetidos.add(contador);
        return nRepetidos;
    }
}
