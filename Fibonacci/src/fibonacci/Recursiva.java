package fibonacci;

public class Recursiva {

    public static int fibonacci(int n) {

        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tamvien para incluir negativos
        
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1
        }else if(n==1){
            return 1;
        }else
            //suma
            return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        int serie = 10;
        for(int i = 0; i<serie; i++){
            System.out.println(fibonacci(i));
        }
    }
}


