package sololearnPoo1;

public class Student {
    String nombre;
    int edad;
    
    public Student(){
    }
    
    public void verificarEdad(int edad){
        if(edad<0){
            System.out.println("Invalid age");
            edad = 0;
        }else{
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
