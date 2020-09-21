package com.unicauca.tallerprincipiossolid.domain;

/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public class TarifaCarro extends CalcularTarifa {
      
    @Override
    public int CalcularTarifa(int minutos) {
         tarifa=2000;
        if (minutos>60){
            tarifa += (minutos-60)*(50/3);
            tarifa = redondear(tarifa);
         }    
        return tarifa;
    }   
}
