/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw.vehiculos;

/**
 *
 * @author FX506
 */
public class MisVehiculos {

    public static void main(String[] args) {

        //Ejer 17
        Vehiculo miCacharro = new Vehiculo("8888 UWU", "Nissan", 
                "Onii", "Verde", 80);
        
        System.out.println(Vehiculo.datosVehiculo(miCacharro));
        
        miCacharro.matricula = "3333 OWO";
        
        System.out.println(Vehiculo.datosVehiculo(miCacharro));
        
        miCacharro.setMatricula("9999 IWI");
        
        System.out.println(Vehiculo.datosVehiculo(miCacharro));
        

    }
}
