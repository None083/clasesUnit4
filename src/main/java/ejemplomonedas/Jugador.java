/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplomonedas;

/**
 *
 * @author noelia
 */
public class Jugador {

    private String nombre;
    private int edad;
    private String genero;
    private int vida;

    private int monedas;

    public Jugador(String nombre, int edad, String genero, int monedas, int vida) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.monedas = monedas;
        this.vida = vida;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", genero=").append(genero);
        sb.append(", vida=").append(vida);
        sb.append(", monedas=").append(monedas);
        sb.append('}');
        return sb.toString();
    }

    public void juegaAzar(int numero) {
        if (numero < 10) {
            //sumar 5
            this.monedas += 5;
        } else {
            //sumar 2
            this.monedas += 2;
        }
    }

    public void tomarMedicina(String medicina) {
        switch (medicina) {
            case "Pancetamol" -> {
                this.vida += 6;
            }
            case "Ibuprofeno" ->{
                this.vida += 3;
            }
        }
        if(this.vida>100){
            this.vida =100;
        }
    }
    
    public int cantidadPastillasParacetamol(){
        int pastillas;
        
        int vidaRestante = 100 - this.vida;
        pastillas = Math.ceilDiv(vidaRestante, 6);
        //pastillas = Math.ceil((double) vidaRestante / 6);
        
        return pastillas;
    }

}
