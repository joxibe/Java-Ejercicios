package poopolimorfismo;

import vehiculos.*;


public class POOPolimorfismo {

    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("JFW213", "Chevrolet", "Sail");
        //Polimorfismo
        misVehiculos[1] = new Turismo(4, "KQS48E", "For", "Bronco");
        misVehiculos[2] = new Furgoneta(200, "RES324", "Renaul", "Koleos"); 
        misVehiculos[3] = new Deportivo(3000, "QSA123", "Bugatti", "Beyron");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
    
}
