package ventas;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de ventas");
        int ventas = sc.nextInt();
        double sumaVentas = 0;
        double ventaSum = 0;
        double[] ventasIngresadas = new double [ventas];
        
        for(int i = 0; i<ventas; i++ ){
            System.out.println("Ingrese el precio de la venta");
            double ventaNum = sc.nextDouble();
            ventasIngresadas[i] = ventaNum;
            ventaSum += ventaNum;
        }
        
        System.out.println("Ventas Ingresadas");
        for(double x: ventasIngresadas){
            System.out.println(x);
        }
        System.out.println("la Suma total de las ventas es:" + ventaSum);
    }
        
}
