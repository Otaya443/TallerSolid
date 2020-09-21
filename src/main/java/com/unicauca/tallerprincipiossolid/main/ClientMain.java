package com.unicauca.tallerprincipiossolid.main;

import com.unicauca.tallerprincipiossolid.domain.AutoEnum;
import com.unicauca.tallerprincipiossolid.domain.Ingreso;
import com.unicauca.tallerprincipiossolid.domain.access.Factory;
import com.unicauca.tallerprincipiossolid.domain.access.IIngresoRepository;
import com.unicauca.tallerprincipiossolid.service.Service;


/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Le decimos a la fábrica que nos de el repositorio por defecto
        IIngresoRepository repository = Factory.getInstance().getRepository("default");
        Service service = new Service(repository);

        Ingreso newIngreso = new Ingreso(1,AutoEnum.CARRO,70);
    
        service.saveIngreso(newIngreso);

        newIngreso = new Ingreso(2,AutoEnum.CAMION,1770);
        service.saveIngreso(newIngreso);
        
        newIngreso = new Ingreso(3,AutoEnum.MOTO,10);
        service.saveIngreso(newIngreso);
        
        for (Ingreso p : service.listIngresos()) {
            System.out.println(p);
        }

    }

}