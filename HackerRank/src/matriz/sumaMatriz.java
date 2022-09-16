package matriz;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class sumaMatriz {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int matriz[][], nFilas, nColum;

//        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
//        nColum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Columnas"));
//        matriz = new int[3][3];

//        //captura los numeros de la matriz
//        System.out.println("Digite la matriz");
//        for (int i = 0; i < nFilas; i++) {
//            for (int j = 0; j < nColum; j++) {
//                System.out.println("Matriz["+i+"]["+j+"]: ");
//                matriz[i][j] = sc.nextInt();
//            }
//        }

        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {9, 8, 9},
        };
        
        System.out.println("La matriz es: ");
        imprimirMatriz(matriz);
        System.out.println("Suma de fila: ");
        sumaFilas(matriz);
        System.out.println("Suma de columnas: ");
        sumaColum(matriz);
        System.out.println("Diferencia diagonal: " + diferenciaDiagonal(matriz) );

    }

    public static void imprimirMatriz(int matriz[][]) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
            }
            System.out.println();
        }
    }

    public static void sumaFilas(int matriz[][]) {
        int sumaFilas = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
                sumaFilas += matriz[i][j];
            }
            System.out.printf("= %d\n", sumaFilas);
        }
    }

    public static void sumaColum(int matriz[][]) {
        //imprimir la matriz normalmente
        imprimirMatriz(matriz);
        //imprimir una linea
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print("__");
        }
        System.out.println("");
        //recorrer columna y sumar
        int sumaColum = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaColum += matriz[i][j];
            }
            System.out.printf("%d ", sumaColum);
        }
        System.out.println("");
    }
    
    public static int diferenciaDiagonal(int matriz [][]){
        int sFila = 0;
        int sColm = 0;
        int tamanio = matriz.length;
        
        for (int i = 0; i < tamanio; i++) {
            sFila += matriz[i][i];
        }
        
        for (int i = 0; i < tamanio; i++) {
            sColm += matriz[tamanio-1-i][i];
        }
        
        System.out.println(sFila + " | " + sColm);
        
        if(sFila > sColm){
            return sFila - sColm;
        }else{
            return sColm - sFila;
        }
    }
}
