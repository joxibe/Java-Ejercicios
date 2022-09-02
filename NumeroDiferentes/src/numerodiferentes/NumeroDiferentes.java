package numerodiferentes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class NumeroDiferentes {

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        // add elements to ArrayList
        x.add(5);
        x.add(5);
        x.add(3);
        x.add(5);
        x.add(2);
        x.add(5);

        NumeroDiferentes result = new NumeroDiferentes();
        result.cantidadMinimaDias(x);
        // iterate through List
    }

//    public void catindadMinimaDias(List<Integer> x) {
//        
//        List<Integer> UniqueNumbers = x.stream().distinct().collect(Collectors.toList());
//        for (int i = 0; i < UniqueNumbers.size(); ++i) {
//            System.out.println(UniqueNumbers.get(i));
//        }
//    }
    
    public int cantidadMinimaDias(List<Integer> x) {
        int n = 0; 
        HashSet<Integer> hashSetNumbers = new HashSet<Integer>(x);

        System.out.println("Unique Values of ArrayList");

        for (Integer strNumber : hashSetNumbers){
            System.out.println(strNumber);
            n = strNumber;
        }
        
        return n;
    }
}
