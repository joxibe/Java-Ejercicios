package domain;

public class Estudiante extends Persona {
    private int cEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad);
        this.cEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + "\nCodigoEstudiante: " + cEstudiante
        + "\nNotaFinal: " + notaFinal);
    }

    public int getCodigoEstudiante() {
        return cEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.cEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
}
