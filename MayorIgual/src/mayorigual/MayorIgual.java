package mayorigual;

public class MayorIgual {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("a: " + a + " b: " + b);
        if(a>b){
            System.out.println("a es mayor: " + a + " que: " + b);
        }else{
            if(a==b){
                System.out.println(a +" es igual: " + b);
            }else{
                System.out.println(a + " es menor que " + b);
            }
        }
    }
    
}
