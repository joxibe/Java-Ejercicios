package odenarray;

public class OdenArray {

    public static void main(String[] args) {
        int[] arreglo1 = {5, 7, 6, 9};
        int[] arreglo2 = {7, 6, 5, 4};
        int[] arreglo3 = {5, 6, 7, 8};
        int[] arreglo4 = {4, 4, 4, 4};

        int contador = 1;

        ordenado(arreglo1);
        ordenado(arreglo2);
        ordenado(arreglo3);
        ordenado(arreglo4);
    }

    static void ordenado(int[] arreglo) {
        if (ordenadoAscendente(arreglo)) {
            System.out.println("Ascendente");
        } else if (ordenadoDescendente(arreglo)) {
            System.out.println("Descendente");
        } else if (iguales(arreglo)){
            System.out.println("iguales");
        } else {
            System.out.println("Desordenado");
        }
    }

    static boolean ordenadoAscendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] + 1) != array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean ordenadoDescendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] - 1) != array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    static boolean iguales(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            if((array[i] - 1) == array[i +1]){
                return false;
            }
        }
        return true;
    }

}
