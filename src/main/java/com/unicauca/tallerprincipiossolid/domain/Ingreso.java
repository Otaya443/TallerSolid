package com.unicauca.tallerprincipiossolid.domain;

/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public class Ingreso {

    private int ingresoId;

    private AutoEnum tipo;

    private int tiempo;

    /**
     * Parametros del constructor parametrizado para el IngresoId, el tipo y el
     * tiempo
     *
     * @param ingresoId
     * @param tipo
     * @param tiempo
     */

    public Ingreso(int ingresoId, AutoEnum tipo, int tiempo) {
        this.ingresoId = ingresoId;
        this.tipo = tipo;
        this.tiempo = tiempo;
    }

    /**
     * Constructor por defecto
     */

    public Ingreso() {
    }
    //Getters and Setters

    public int getIngresoId() {
        return ingresoId;
    }

    public void setIngresoId(int ingresoId) {
        this.ingresoId = ingresoId;
    }

    public AutoEnum getTipo() {
        return tipo;
    }

    public void setTipo(AutoEnum tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Ingreso: " + ingresoId + ", tipo de vehículo: "
                + tipo.toString().toLowerCase() + ", tiempo =  " + tiempo + " minutos";
    }
}
