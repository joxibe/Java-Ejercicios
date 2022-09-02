package vehiculos;

public class Turismo extends Vehiculo{
    private int nPuertas;
    
    
    public Turismo(int nPuertas, String matricula, String marca, String modelo){
        //herencia
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
        
    }
    
    //sobreecribir
    @Override
    public String mostrarDatos(){
        return "nPuertas: " + nPuertas + "\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
    
    public int getnPuertas(int nPuertas){
        return this.nPuertas;
    }
}
