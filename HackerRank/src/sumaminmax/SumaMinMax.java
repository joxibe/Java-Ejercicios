package sumaminmax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumaMinMax {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        sumaminmax(arr);
    }

    public static void sumaminmax(List<Integer> arr) {
        Long suma = 0L;
        for (int i = 0; i < arr.size(); i++) {
            suma += arr.get(i);
        }
        
        List<Long> numeros = new ArrayList<>();
        while(numeros.size()<arr.size()){
            for (int i = 0; i <arr.size() ; i++) {
                numeros.add(suma-arr.get(i));
            }
        }
//        numeros.add(suma-arr.get(0));
//        numeros.add(suma-arr.get(1));
//        numeros.add(suma-arr.get(2));
//        numeros.add(suma-arr.get(3));
//        numeros.add(suma-arr.get(4));

        System.out.println(Collections.min(numeros));
        System.out.println(Collections.max(numeros));
        
    }
}
