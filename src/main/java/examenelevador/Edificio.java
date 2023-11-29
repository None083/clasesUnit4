/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenelevador;

import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class Edificio {

    public static void main(String[] args) {
        
        Elevador e1 = new Elevador("Toyota", 4, 500);
        Elevador e2 = new Elevador("Renault", 12, 900);
        
        boolean viaje1 = e1.mover(3, 300, 2);
        System.out.println("¿Se ha realizado el viaje? " + viaje1);
        System.out.println("Elevador 1 \n" + e1);
        System.out.println("--------------------------------------------------");
        
        boolean viaje2 = e1.mover(5, 300, 4);
        System.out.println("¿Se ha realizado el viaje? " + viaje2);
        System.out.println("Elevador 1 \n" + e1);
        System.out.println("--------------------------------------------------");
        
        boolean viaje3 = e1.mover(8, 300, 1);
        System.out.println("¿Se ha realizado el viaje? " + viaje3);
        System.out.println("Elevador 1 \n" + e1);
        System.out.println("--------------------------------------------------");
        
        boolean viaje4 = e1.mover(4, 500, 1);
        System.out.println("¿Se ha realizado el viaje? " + viaje4);
        System.out.println("Elevador 1 \n" + e1);
        System.out.println("--------------------------------------------------");
        
        System.out.println("Próxima revisión de Elevador 1: " + proximaRevision(e1));
        
    }
    
    public static LocalDate proximaRevision(Elevador e){
        return e.getFechaUltimaRevision().plusMonths(6);
    }
    
}
