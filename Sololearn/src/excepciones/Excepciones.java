package excepciones;

public class Excepciones {
    public static void main(String[] args) {
        try{
            int a[] = new int [2];
            //ocurre un error porque no hay nada en la posicion 5 del array
            System.out.println(a[5]);
        }catch( Exception e){
            System.out.println("An error ocurred");
        }
    }
}
