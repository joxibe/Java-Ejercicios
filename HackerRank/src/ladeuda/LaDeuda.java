package ladeuda;

import java.util.*;
import java.lang.*;

public class LaDeuda {

    public static void main(String[] args) {
        List<Long> prestamo = new ArrayList<>();
        prestamo.add(Long.valueOf(15));
        prestamo.add(Long.valueOf(16));
        prestamo.add(Long.valueOf(45));
        System.out.println(calcularDias(prestamo));
        

//        int prestamo = 45;
//        System.out.println(calcularDias(prestamo));
    }

    public static List<Long> calcularDias(List<Long> prestamo) {
        int dia = 1;
        int vPagado = 1;
        int pagoDia = 1;
        List<Long> dias = new ArrayList<>();
        for (int i = 0; i < prestamo.size(); i++) {
            while (prestamo.get(i) > pagoDia) {
                vPagado = vPagado * 2;
                pagoDia = pagoDia + vPagado;
                dia++;
            }
            dias.add(i, Long.valueOf(dia));
        }
        return dias;

//        int dia = 1;
//        int vPagado = 1;
//        int pagoDia = 1;
//        while(prestamo > pagoDia) {
//            vPagado = vPagado*2;
//            pagoDia = pagoDia + vPagado;
//            dia++;
//        }
//        return dia;
    }
}
