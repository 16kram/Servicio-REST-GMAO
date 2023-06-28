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
    private String familia;
    private String procedimiento;
    private String localizacion;
    private String frecuencia;
    private boolean enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
    private String estadoPreventivo;
    private String fecha;
    private String hora;

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

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public boolean isEnero() {
        return enero;
    }

    public void setEnero(boolean enero) {
        this.enero = enero;
    }

    public boolean isFebrero() {
        return febrero;
    }

    public void setFebrero(boolean febrero) {
        this.febrero = febrero;
    }

    public boolean isMarzo() {
        return marzo;
    }

    public void setMarzo(boolean marzo) {
        this.marzo = marzo;
    }

    public boolean isAbril() {
        return abril;
    }

    public void setAbril(boolean abril) {
        this.abril = abril;
    }

    public boolean isMayo() {
        return mayo;
    }

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }

    public boolean isJunio() {
        return junio;
    }

    public void setJunio(boolean junio) {
        this.junio = junio;
    }

    public boolean isJulio() {
        return julio;
    }

    public void setJulio(boolean julio) {
        this.julio = julio;
    }

    public boolean isAgosto() {
        return agosto;
    }

    public void setAgosto(boolean agosto) {
        this.agosto = agosto;
    }

    public boolean isSeptiembre() {
        return septiembre;
    }

    public void setSeptiembre(boolean septiembre) {
        this.septiembre = septiembre;
    }

    public boolean isOctubre() {
        return octubre;
    }

    public void setOctubre(boolean octubre) {
        this.octubre = octubre;
    }

    public boolean isNoviembre() {
        return noviembre;
    }

    public void setNoviembre(boolean noviembre) {
        this.noviembre = noviembre;
    }

    public boolean isDiciembre() {
        return diciembre;
    }

    public void setDiciembre(boolean diciembre) {
        this.diciembre = diciembre;
    }

    public String getEstadoPreventivo() {
        return estadoPreventivo;
    }

    public void setEstadoPreventivo(String estadoPreventivo) {
        this.estadoPreventivo = estadoPreventivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
