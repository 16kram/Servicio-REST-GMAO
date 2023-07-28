/**
 * Clase para hacer pruebas con el Controlador
 */
package araque.porqueras.Gmao.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban Porqueras
 */
@RestController

public class PruebaController {

    @GetMapping
    public String prueba(@PathVariable String nombre) {
        return ("Hola " + nombre);
    }

    @GetMapping("/pruebaresponse")
    public ResponseEntity<String> traerRespueta() {
        return new ResponseEntity("Esto es un ResponsEntity", HttpStatus.BAD_REQUEST);
    }
}
