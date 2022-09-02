package sololearn;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglosMultidimensionales {

    public static void main(String[] args) {
        //llmar metodo
        matriz1 = definirTamanio(matriz1);
        System.out.println("Filas: " + matriz1.length);
        //de la matriz1 imprimir la fila [0] y sus columnas
        System.out.println("Columnas: " + matriz1[0].length);

        System.out.println();
        ingresarValores(matriz1);
        System.out.println();
        imprimirMatriz(matriz1);
        
        matriz2 = definirTamanio(matriz2);
    }

    static Scanner sc = new Scanner(System.in);
    static int[][] matriz1;
    static int[][] matriz2;

    //metodo para crear la matriz
    public static int[][] definirTamanio(int[][] x) {
        System.out.println("Ingrese el tamaño de la matriz filas&columnas");
        String datosIngresados = sc.next();

        //Para separar los numeros ingresados
        String[] datos = datosIngresados.split("&");
        int fila = Integer.valueOf(datos[0]);
        int columna = Integer.valueOf(datos[1]);

        x = new int[fila][columna];

        return x;
    }

    public static void ingresarValores(int[][] x) {
        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = Integer.valueOf(sc.next());
            }
        }
    }

    public static void imprimirMatriz(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
