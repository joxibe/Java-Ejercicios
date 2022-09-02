package menosmas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenosMas {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(-4);
        numeros.add(3);
        numeros.add(-9);
        numeros.add(0);
        numeros.add(4);
        numeros.add(1);
        masmenos(numeros);

    }

    public static void masmenos(List<Integer> arr) {
        List<Double> proporcion = new ArrayList<>();
        double nPositivos = 0;
        double nNegativos = 0;
        double nNeutros = 0;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                nPositivos++;
            }
            if (arr.get(i) < 0) {
                nNegativos++;
            }
            if (arr.get(i) == 0) {
                nNeutros++;
            }
        }
        nPositivos = nPositivos / arr.size();
        nNegativos = nNegativos / arr.size();
        nNeutros = nNeutros / arr.size();
        proporcion.add(0, nPositivos);
        proporcion.add(1, nNegativos);
        proporcion.add(2, nNeutros);
        for (Double double1 : proporcion) {
            System.out.println(df.format(double1));
        }
    }
}
