package com.unicauca.tallerprincipiossolid.domain;

/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public abstract class CalcularTarifa {

    protected int tarifa;

    protected int redondear(int valor) {
        int residuo = valor % 100;
        if (residuo != 0) {
            valor += 100 - residuo;
        }
        return valor;
    }

    abstract public int CalcularTarifa(int minutos);

}
