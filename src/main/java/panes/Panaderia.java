/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panes;

/**
 *
 * @author noelia
 */
public class Panaderia {

    public static void main(String[] args) {
        
        Pan pan1 = new Pan("Viena", "trigo", 0.4);
        Pan pan2 = new Pan();
        pan2.setVariedad("Chapata");
        pan2.setTipoHarina("Trigo");
        pan2.setPeso(0.5);
        
        System.out.println(pan1.toString());
        System.out.println(pan2.toString());
        
    }
    
}
