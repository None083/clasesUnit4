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
        
        //Instantaciación de un objeto
        //Reserva de espacio en memoria, dando valor a sus atributos
        Vehiculo miCacharro = new Vehiculo("8888 UWU", "Nissan", 
                "Onii", "Verde", 80);
        
        System.out.println(miCacharro.toString());
        
        miCacharro.setMatricula("9999 IWI");
        
        System.out.println(miCacharro.toString());
        

    }
}
