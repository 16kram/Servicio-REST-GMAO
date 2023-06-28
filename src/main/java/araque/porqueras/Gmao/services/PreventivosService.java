/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package araque.porqueras.Gmao.services;

import araque.porqueras.Gmao.models.Preventivos;
import araque.porqueras.Gmao.repositories.PreventivosRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author char_
 */
@Service
public class PreventivosService {

    @Autowired
    PreventivosRepository preventivosRepository;

    public ArrayList<Preventivos> obtenerPreventivos() {
        return (ArrayList<Preventivos>) preventivosRepository.findAll();
    }

    public Preventivos guardarPreventivo(Preventivos preventivos) {
        return preventivosRepository.save(preventivos);
    }
}
