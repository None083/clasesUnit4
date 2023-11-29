/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenelevador;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author FX506
 */
public class Elevador {

    private final static int NUM_DIGITOS_MAX = 8;
    private final static int LIMITE_CAPACIDAD = 10;
    private final static double LIMITE_PESO = 800;
    private final static int PLANTA_MIN = 0;
    private final static int PLANTA_MAX = 8;

    private String numSerie;
    private String fabricante;
    private int capacidadMax;
    private double pesoMax;
    private LocalDate fechaFabricacion;
    private LocalDate fechaUltimaRevision;
    private int numPlanta;
    private Estado estado;

    public Elevador(String fabricante, int capacidadMax, double pesoMax) {
        this.numSerie = RandomStringUtils.randomNumeric(NUM_DIGITOS_MAX);
        this.fabricante = fabricante;

        if (capacidadMax > 0 && capacidadMax <= LIMITE_CAPACIDAD) {
            this.capacidadMax = capacidadMax;
        } else {
            this.capacidadMax = LIMITE_CAPACIDAD;
        }

        if (pesoMax > 0 && pesoMax <= LIMITE_PESO) {
            this.pesoMax = pesoMax;
        } else {
            this.pesoMax = LIMITE_PESO;
        }

        this.fechaFabricacion = LocalDate.now();
        this.fechaUltimaRevision = LocalDate.now();
        this.numPlanta = 0;
        this.estado = Estado.PARADO;
    }

    public int getLIMITE_CAPACIDAD() {
        return LIMITE_CAPACIDAD;
    }

    public double getLIMITE_PESO() {
        return LIMITE_PESO;
    }

    public int getPLANTA_MIN() {
        return PLANTA_MIN;
    }

    public int getPLANTA_MAX() {
        return PLANTA_MAX;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public int getNumPlanta() {
        return numPlanta;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setFechaUltimaRevision(LocalDate fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }

    public void setNumPlanta(int numPlanta) {
        this.numPlanta = numPlanta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("numSerie=").append(numSerie).append("\n");
        sb.append("fabricante=").append(fabricante).append("\n");
        sb.append("capacidadMax=").append(capacidadMax).append("\n");
        sb.append("pesoMax=").append(pesoMax).append("\n");
        sb.append("fechaFabricacion=").append(fechaFabricacion).append("\n");
        sb.append("fechaUltimaRevision=").append(fechaUltimaRevision).append("\n");
        sb.append("numPlanta=").append(numPlanta).append("\n");
        sb.append("estado=").append(estado);
        return sb.toString();
    }

    public boolean mover(int numViajeros, double pesoTotal, int planta) {

        if (numViajeros <= this.capacidadMax && pesoTotal <= this.pesoMax
                && (planta >= PLANTA_MIN && planta <= PLANTA_MAX)) {

            if (this.numPlanta < planta) {
                this.estado = Estado.SUBIENDO;

            } else if (this.numPlanta == planta) {
                this.estado = Estado.PARADO;

            } else {
                this.estado = Estado.BAJANDO;
            }

            this.numPlanta = planta;
            return true;
        }
        this.estado = Estado.PARADO;
        return false;
    }

}
