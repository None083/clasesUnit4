/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafetera;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        //Cafetera vacía
        Cafetera c1 = new Cafetera();
        //Cafetera llena
        Cafetera c2 = new Cafetera(800);
        //Cafetera al gusto
        Cafetera c3 = new Cafetera(1200, 600);
        
        c1.llenarCafetera();
        System.out.println("Se ha llenado c1: " + c1.getCantidadActual());
        c1.servirCafe(120);
        System.out.println("Se ha servido una taza de c1: " + c1.getCantidadActual());
        
        c2.servirCafe(300);
        System.out.println("Se ha servido una taza de c2: " + c2.getCantidadActual());
        c2.agregarCafe(500);
        System.out.println("Se ha agregado café a c2: " + c2.getCantidadActual());
        
        c3.vaciarCafetera();
        System.out.println("Se ha vaciado c3: " + c3.getCantidadActual());
        
    }
    
}
