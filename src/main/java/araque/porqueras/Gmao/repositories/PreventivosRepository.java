/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package araque.porqueras.Gmao.repositories;

import araque.porqueras.Gmao.models.Preventivos;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author char_
 */
@Repository
public interface PreventivosRepository extends CrudRepository<Preventivos, Long> {

    //public abstract ArrayList<Preventivos> findById(String descripcionEquipo);
}
