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

    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;

    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
// los métodos ‘get’ y ‘set’ de la clase Vehiculo 

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
    
    public static String datosVehiculo(Vehiculo v){
        return """
                           Datos de "Mi Cacharro"
                           
                           Matrícula: %s
                           Marca: %s
                           Modelo: %s
                           Color: %s
                           Tarifa: %.2f€
                           
                           """.formatted(v.getMatricula(), v.getMarca(),
                                   v.getModelo(), v.getColor(),
                                   v.getTarifa());
    }

}
