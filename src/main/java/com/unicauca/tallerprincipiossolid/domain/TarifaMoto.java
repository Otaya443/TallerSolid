package com.unicauca.tallerprincipiossolid.domain;
/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public class TarifaMoto extends CalcularTarifa {
      @Override
    public int CalcularTarifa(int minutos) {
         tarifa=1000;
        if (minutos>60){
            tarifa += (minutos-60)*(25/3);
            tarifa= redondear(tarifa);
         }    
        return tarifa;
    }   
}
        

