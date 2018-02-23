/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_guillermosandoval;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Memo
 */
class Carpeta extends Archivo {

    private ArrayList lista = new ArrayList();
    private Date fecha_creacion;
    private Date fecha_modificacion;

    public Carpeta() {
        super();
    }

    public Carpeta(String Nombre, int Size, Date fecha_creacion, Date fecha_modificacion, Carpeta carpeta, ArchivodeTexto archivotexto, Ejecutable ejecutable) {
        super(Nombre, Size, fecha_creacion, fecha_modificacion, carpeta, archivotexto, ejecutable);
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
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
        return "Carpeta{" + "lista=" + lista + '}';
    }

}
