/**
 * Clase repositorio de los usuarios
 */
package araque.porqueras.Gmao.repositories;

import araque.porqueras.Gmao.models.Usuarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Esteban Porqueras
 */
public interface UsuariosRepository extends CrudRepository<Usuarios,Integer>{
    
}
