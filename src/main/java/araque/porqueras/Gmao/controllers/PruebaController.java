/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package araque.porqueras.Gmao.controllers;

import araque.porqueras.Gmao.models.Preventivos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

public class PruebaController {
    
    @GetMapping
    public String prueba(@PathVariable String nombre){
        return("Hola "+nombre);
    }
    
@GetMapping("/pruebaresponse")
public ResponseEntity<String> traerRespueta(){
    return new ResponseEntity("Esto es un ResponsEntity",HttpStatus.BAD_REQUEST);
}
}
