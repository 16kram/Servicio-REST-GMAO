/**
 * Clase repositorio de los preventivos
 */
package araque.porqueras.Gmao.repositories;

import araque.porqueras.Gmao.models.Preventivos;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esteban Porqueras
 */
@Repository
public interface PreventivosRepository extends CrudRepository<Preventivos, Long> {

    //public abstract ArrayList<Preventivos> findByEstadoPreventivo(String estadoPreventivo);
}
