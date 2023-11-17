/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panes;

/**
 *
 * @author noelia
 */
public class Pan {
    
    private String variedad;
    private String tipoHarina;
    private double peso;

    public Pan(String variedad, String tipoHarina, double peso) {
        this.variedad = variedad;
        this.tipoHarina = tipoHarina;
        this.peso = peso;
    }

    public Pan() {
        //Se inicializan los valores por defecto
    }
    
    

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoHarina() {
        return tipoHarina;
    }

    public void setTipoHarina(String tipoHarina) {
        this.tipoHarina = tipoHarina;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pan{");
        sb.append("variedad=").append(variedad);
        sb.append(", tipoHarina=").append(tipoHarina);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
}
