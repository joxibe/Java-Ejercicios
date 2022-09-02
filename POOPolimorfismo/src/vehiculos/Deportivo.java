package vehiculos;

public class Deportivo extends Vehiculo{
    int cilindrada;
    
    public Deportivo(int cilindrada, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String mostrarDatos(){
        return "Cilindrada: " + cilindrada + "\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
    
    public int getCilindrada(int cilindrada){
        return this.cilindrada;
    }
}
