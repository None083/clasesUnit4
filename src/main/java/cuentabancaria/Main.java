/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        //Creo una cuenta bancaria
        CuentaBancaria c1 = new CuentaBancaria("Noelia", "88888888P", 5000, 0.03);
        System.out.println(c1.toString());
        
        //Añado 30 eurillo
        c1.ingresar(30);
        System.out.println("Saldo de la cuenta c1 + 30€: " + c1.getSaldoCuenta());
        
        //Se añaden intereses al saldo
        c1.abonarIntereses();
        System.out.println("Saldo de la cuenta c1 + intereses: " + c1.getSaldoCuenta());
        
        //Se sacan 50 eurillo
        c1.retirar(50);
        System.out.println("Saldo de la cuenta c1 - 50€: " + c1.getSaldoCuenta());
        
        CuentaBancaria c2 = new CuentaBancaria();
        System.out.println(c2);
        
        
    }
    
}
