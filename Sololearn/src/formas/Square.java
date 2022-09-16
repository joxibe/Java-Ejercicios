package formas;

public class Square extends Shape{

    public Square(int x){
        super.width = x;
    }
    @Override
    void area() {
        int a = width * width;
        System.out.println(a);
    }
    
}
