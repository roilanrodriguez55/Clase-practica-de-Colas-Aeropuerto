package Clases;

/**
 *
 * @author roilanrodriguez55
 */
public class Equipaje {
    private String idVuelo;
    private double peso;

    public Equipaje(String idVuelo, double peso) {
        this.idVuelo = idVuelo;
        this.peso = peso;
    }

    
    
    public String getIdVuelo() {
        return idVuelo;
    }

    public double getPeso() {
        return peso;
    }
    
    
    
}
