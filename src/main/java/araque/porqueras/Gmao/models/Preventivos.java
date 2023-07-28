/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package araque.porqueras.Gmao.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author char_
 */
@Entity
@Table(name = "preventivos")
public class Preventivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String descripcionEquipo;
    private String estadoPreventivo;

    /*private String familia;
    private String procedimiento;
    private String localizacion;
    private String frecuencia;
    private boolean enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
    private String fecha;
    private String hora;*/
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcionEquipo() {
        return descripcionEquipo;
    }

    public void setDescripcionEquipo(String descripcionEquipo) {
        this.descripcionEquipo = descripcionEquipo;
    }

    public String getEstadoPreventivo() {
        return estadoPreventivo;
    }

    public void setEstadoPreventivo(String estadoPreventivo) {
        this.estadoPreventivo = estadoPreventivo;
    }

}
