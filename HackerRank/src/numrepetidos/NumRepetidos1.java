package numrepetidos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumRepetidos1 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 2, 3, 7, 1, 2, 8, 4, 4);

        System.out.println(coutingSort(numeros));
    }

    public static List<Integer> coutingSort(List<Integer> arr) {
        Integer[] frequencyArray = new Integer[100];
        Arrays.fill(frequencyArray, 0);

        for (int i = 0; i < arr.size(); i++) {
            int arrayElement = arr.get(i);
            frequencyArray[arrayElement]++;
        }

        return Arrays.asList(frequencyArray);
    }
}
