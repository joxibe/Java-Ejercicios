package formas;

public class Circle extends Shape{
    
    public Circle(int x){
        super.width = x;
    }
    
    @Override
    void area(){
        final double PI = Math.PI;
        double a = PI * (width * width);
        System.out.println(a);
    }
}
