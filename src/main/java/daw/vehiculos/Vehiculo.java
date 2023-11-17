/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.vehiculos;

/**
 *
 * @author FX506
 */
public class Vehiculo {

    // Atributos - características
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    // el método constructor de la clase Vehiculo, se llama igual que la clase, 
    //siempre es public, no devuelve valor, puede tener parámetros
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
    
    // los métodos ‘get’ y ‘set’ de la clase Vehiculo - acciones
    //son public

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void aplicarDescuentoTarifa(double descuento) {
        this.tarifa -= descuento;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", color=").append(color);
        sb.append(", tarifa=").append(tarifa);
        sb.append(", disponible=").append(disponible);
        sb.append('}');
        return sb.toString();
    }
    
    
    public void acelerar(double nuevaVel){
        //this.velocidad += nuevaVel;
    }
    
    public void frenar(double nuevaVel){
        //this.velocidad -= nuevaVel;
    }
    

}
