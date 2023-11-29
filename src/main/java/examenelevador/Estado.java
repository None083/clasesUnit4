/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package examenelevador;

public enum Estado {
    
    SUBIENDO("subiendo"),
    BAJANDO("bajando"),
    PARADO("parado"),
    AVERIADO("averiado");
    
    private final String estado;

    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

}
