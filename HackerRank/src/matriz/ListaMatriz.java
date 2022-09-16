package matriz;

import java.util.Arrays;
import java.util.List;

public class ListaMatriz {

    public static void main(String[] args) {
//        List<List<Integer>> arr = Arrays.asList(Arrays.asList(11, 2, 4), 
//                                                Arrays.asList(4, 5, 6), 
//                                                Arrays.asList(10, 8, -12));

        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2, 3),
                                                Arrays.asList(4, 5, 6),
                                                Arrays.asList(9, 8, 9));

        for (List<Integer> i : arr) {
            System.out.println(i);
        }

        System.out.println(diferenciaDiagonal(arr));
    }

    public static int diferenciaDiagonal(List<List<Integer>> arr) {
        int size = arr.get(0).size();
        int dDiag1 = 0;
        int dDiag2 = 0;
        
        for (int i = 0; i < size; i++) {
            dDiag1 += arr.get(i).get(i);
        }
        
        for (int i = 0; i < size; i++) {
            dDiag2 += arr.get(size-1-i).get(i);
        }
        
        if(dDiag1 > dDiag2){
            return dDiag1-dDiag2;
        }else{
            return dDiag2-dDiag1;
        }
    }
}
