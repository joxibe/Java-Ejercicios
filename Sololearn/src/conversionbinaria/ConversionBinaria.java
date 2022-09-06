package conversionbinaria;

import java.util.Scanner;

public class ConversionBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
    }
}

