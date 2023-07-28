/**
 * Clase servicio de los usuarios
 */
package araque.porqueras.Gmao.services;

import araque.porqueras.Gmao.models.Usuarios;
import araque.porqueras.Gmao.repositories.UsuariosRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esteban Porqueras
 */
@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository usuariosRepository;

    public ArrayList<Usuarios> obtenerUsuarios() {
        return (ArrayList<Usuarios>) usuariosRepository.findAll();
    }

    public Usuarios guardarUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    public Optional<Usuarios> obtenerUsuarioPorId(int id) {
        return usuariosRepository.findById(id);
    }

    public boolean eliminarUsuario(int id) {
        try {
            usuariosRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
