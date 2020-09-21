
package com.unicauca.tallerprincipiossolid.domain.access;

import com.unicauca.tallerprincipiossolid.domain.Ingreso;
import java.util.List;

/**
 *
 * @author Camilo Otaya-Maria Teresa Trujillo
 */
public interface IIngresoRepository {
    boolean save(Ingreso newProduct);

    List<Ingreso> list();
}
