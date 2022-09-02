package vehiculos;

public class Furgoneta extends Vehiculo{
    int carga;
    
    public Furgoneta(int carga, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Carga: " + carga + "\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
    
    public int getCarga(int carga){
        return this.carga;
    }
}

