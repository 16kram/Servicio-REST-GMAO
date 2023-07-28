/**
 * Clase repositorio de los usuarios
 */
package araque.porqueras.Gmao.repositories;

import araque.porqueras.Gmao.models.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esteban Porqueras
 */
@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Integer> {

}
