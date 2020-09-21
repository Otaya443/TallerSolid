package com.unicauca.tallerprincipiossolid.domain;

import com.unicauca.tallerprincipiossolid.domain.access.Factory;

/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public class Parqueadero {

    /**
     * Calcular costo de entrega
     *
     * @param order orden sobre la cual se calcula el costo de entrega
     * @return costo de entrega
     */
    public int calcularTarifa(Ticket ticket) {

        if (ticket == null) {
            return -1;
        }
        // La fábrica devuelve una instancia de la jerarquia IDelivery  
        CalcularTarifa tarifa = Factory.getInstance().getVehiculo(ticket.getVehiculo());
        int result = tarifa.CalcularTarifa(ticket.getMinutos());
        return result;

    }
}
