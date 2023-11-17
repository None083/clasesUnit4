/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class CuentaBancaria {
    
    //Atributos de clase
    //Accesibles mediante el nombre de la clase
    //No se usan con this
    //No es necesario crear ningún objeto para usar este atributo
    public static final int MAX_DIGITOS_CUENTA = 20;
    
    //Atributos de instancia
    //Accesibles mediante el nombre del objeto
    //Se usan con this
    //Hay que crear un objeto cuenta para qu cada cuenta tenga sus propios valores
    private final String NUMERO_CUENTA;
    private String nombre;
    private String NIF;
    private double saldoCuenta;
    private double interesMensual;

    //Constructor sin parámetros
    public CuentaBancaria() {
        this.NUMERO_CUENTA = RandomStringUtils.randomNumeric(MAX_DIGITOS_CUENTA);
    }

    public CuentaBancaria(String nombre, String NIF, double saldoCuenta, double interesMensual) {
        this.NUMERO_CUENTA = RandomStringUtils.randomNumeric(MAX_DIGITOS_CUENTA);
        this.nombre = nombre;
        this.NIF = NIF;
        this.saldoCuenta = saldoCuenta;
        this.interesMensual = interesMensual;
    }

    public int getMAX_DIGITOS_CUENTA() {
        return MAX_DIGITOS_CUENTA;
    }

    public String getNUMERO_CUENTA() {
        return NUMERO_CUENTA;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }
    
    public void ingresar(double cantidad){
        this.saldoCuenta += cantidad;
    }
    
    public boolean retirar(double cantidad){
        boolean respuesta = false;
        if(this.saldoCuenta>=cantidad){
            this.saldoCuenta -= cantidad;
            respuesta = true;
        }
        return respuesta;
    }
    
    public void abonarIntereses(){
        if(interesMensual<1){
            this.saldoCuenta += this.saldoCuenta * this.interesMensual;
        }else{
            this.saldoCuenta += this.saldoCuenta * this.interesMensual / 100;
        }
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaBancaria{");
        sb.append("NUMERO_CUENTA=").append(NUMERO_CUENTA);
        sb.append(", nombre=").append(nombre);
        sb.append(", NIF=").append(NIF);
        sb.append(", saldoCuenta=").append(saldoCuenta);
        sb.append(", interesMensual=").append(interesMensual);
        sb.append('}');
        return sb.toString();
    }

    

    
    
    
    
}
