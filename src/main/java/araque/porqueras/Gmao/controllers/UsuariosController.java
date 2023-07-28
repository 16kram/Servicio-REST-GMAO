/**
 * Clase controladora de los usuarios
 */
package araque.porqueras.Gmao.controllers;

import araque.porqueras.Gmao.models.Usuarios;
import araque.porqueras.Gmao.services.UsuariosService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban Porqueras
 */
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuariosService usuariosService;

    @GetMapping()
    public ArrayList<Usuarios> obtenerUsuarios() {
        return usuariosService.obtenerUsuarios();
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuarios> obtenerPreventivoPorId(@PathVariable("id") int id) {
        return this.usuariosService.obtenerUsuarioPorId(id);
    }

    @PostMapping()
    public Usuarios guardarUsuarios(@RequestBody Usuarios usuarios) {
        return this.usuariosService.guardarUsuario(usuarios);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUsuarioPorId(@PathVariable("id") int id) {
        boolean ok = this.usuariosService.eliminarUsuario(id);
        if (ok) {
            return "Se eliminó el preventivo";
        } else {
            return "No se pudo eliminar el preventivo";
        }
    }

}
