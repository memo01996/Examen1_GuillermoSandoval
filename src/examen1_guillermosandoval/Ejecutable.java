/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_guillermosandoval;

import java.util.Date;

/**
 *
 * @author Memo
 */
class Ejecutable extends Archivo{

    private String texto;
    private String sistemaoperativo;
    private Date fecha_creacion = new Date();
    private Date fecha_modificacion = new Date();

    public Ejecutable() {
        super();
    }

    public Ejecutable(String texto, String sistemaoperativo) {
        this.texto = texto;
        this.sistemaoperativo = sistemaoperativo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getSistemaoperativo() {
        return sistemaoperativo;
    }

    public void setSistemaoperativo(String sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public void fecha_creacion() {
        fecha_creacion = new Date();
    }

    public void fecha_modificacion() {
        fecha_modificacion = new Date();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
