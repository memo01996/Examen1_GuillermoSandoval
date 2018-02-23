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
class Ejecutable extends Archivo {

    private String texto;
    private String sistemaoperativo;
    private Date fecha_creacion;
    private Date fecha_modificacion;

    public Ejecutable() {
        super();
    }

    public Ejecutable(String texto, String sistemaoperativo, String Nombre, int Size, Date fecha_creacion, Date fecha_modificacion, Carpeta carpeta, ArchivodeTexto archivotexto, Ejecutable ejecutable) {
        super(Nombre, Size, fecha_creacion, fecha_modificacion, carpeta, archivotexto, ejecutable);
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

    @Override
    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
 
    @Override
    public void fecha_creacion() {
        fecha_creacion = new Date();
    }

    @Override
    public void fecha_modificacion() {
        fecha_modificacion = new Date();
    }

    @Override
    public String toString() {
        return "Ejecutable{" + "texto=" + texto + ", sistemaoperativo=" + sistemaoperativo + ", fecha_creacion=" + fecha_creacion + ", fecha_modificacion=" + fecha_modificacion + '}';
    }

}
