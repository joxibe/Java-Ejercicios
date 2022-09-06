package numerosletras;

public class NumerosLetras {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5};
        System.out.println(sum(numeros));
        String[] texto = {"gato", "es", "enfermo"};
        System.out.println(sum(texto));
    }
    
    public static Integer sum(Integer[] x){
        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        return suma;
    }
    
    public static String sum(String[] x){
        String concatenado = "";
        for (int i = 0; i < x.length; i++) {
            concatenado += x[i];
        }
        return concatenado;
    }
}
