/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package araque.porqueras.Gmao.controllers;

import araque.porqueras.Gmao.models.Preventivos;
import araque.porqueras.Gmao.services.PreventivosService;
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
 * @author char_
 */
@RestController
@RequestMapping("/preventivos")
public class PreventivosController {

    @Autowired
    PreventivosService preventivosService;

    @GetMapping()
    public ArrayList<Preventivos> obtenerPreventivos() {
        return preventivosService.obtenerPreventivos();
    }

    @GetMapping(path = "/{id}")
    public Optional<Preventivos> obtenerPreventivoPorId(@PathVariable("id") Long id) {
        return this.preventivosService.obtenerPreventivoPorId(id);
    }

    @PostMapping()
    public Preventivos guardarPreventivos(@RequestBody Preventivos preventivos) {
        return this.preventivosService.guardarPreventivo(preventivos);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPreventivoPorId(@PathVariable("id") Long id) {
        boolean ok = this.preventivosService.eliminarPreventivo(id);
        if (ok) {
            return "Se eliminó el preventivo";
        } else {
            return "No se pudo eliminar el preventivo";
        }
    }
}
