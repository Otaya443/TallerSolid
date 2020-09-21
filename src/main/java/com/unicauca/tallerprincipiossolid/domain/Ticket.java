package com.unicauca.tallerprincipiossolid.domain;

/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public class Ticket {

    private AutoEnum tipoVehiculo;
    private int minutos;

    public AutoEnum getVehiculo() {
        return tipoVehiculo;
    }

    public int getMinutos() {
        return minutos;
    }

    public Ticket(AutoEnum vehiculo, int minutos) {
        tipoVehiculo = vehiculo;
        this.minutos = minutos;
    }

}
