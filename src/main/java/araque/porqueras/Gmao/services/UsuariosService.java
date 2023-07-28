/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package araque.porqueras.Gmao.services;

import araque.porqueras.Gmao.models.Usuarios;
import araque.porqueras.Gmao.repositories.UsuariosRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author char_
 */
public class UsuariosService {

    @Autowired
    UsuariosRepository usuariosRepository;

    public ArrayList<Usuarios> obtenerUsuarios() {
        return (ArrayList<Usuarios>) usuariosRepository.findAll();
    }

    public Usuarios guardarUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    public Optional<Usuarios> obtenerPreventivoPorId(int id) {
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
