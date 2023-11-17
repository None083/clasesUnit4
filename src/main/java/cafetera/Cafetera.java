/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author noelia
 */
public class Cafetera {
    
    private int capacidadMaxima;
    private int cantidadActual;

    //Constructor cafetera vacía
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    
    //Contructor capacidad máxima
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }
    
    //Constructor ajuste de capacidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        if(this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        }
    }
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirCafe(int cantidadAServir){
        
        if(this.cantidadActual < cantidadAServir){
            this.cantidadActual = 0;
        }else{
            this.cantidadActual -= cantidadAServir;
        }
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidadAPoner){
        
        if((this.cantidadActual+cantidadAPoner) > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        } else{
            this.cantidadActual += cantidadAPoner;
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
    
    
    
}
