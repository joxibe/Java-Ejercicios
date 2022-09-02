package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValoresUnicos {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
//        numeros.add(5);
        System.out.println("Numeros de la lista: " + numeros);
        System.out.println("La cantidad de numeros unicos es: " + cantidadMinimaDias(numeros));
    }
    
    public static int cantidadMinimaDias(List<Integer> x){
        List<Integer> vUnicos = x.stream().distinct().collect(Collectors.toList());
        int cNumerosUnicos = vUnicos.size();
        System.out.println("Numeros unicos: " + vUnicos);
        return cNumerosUnicos;
    }
    
}
