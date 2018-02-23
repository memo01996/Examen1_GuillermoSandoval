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

    private ArrayList<Archivo> lista1 = new ArrayList();
    private Date fecha_creacion  = new Date();
    private Date fecha_modificacion = new Date();

    public Carpeta() {
        super();
    }

    public Carpeta(ArrayList lista1, String Nombre) {
        super(Nombre);
        this.lista1 = lista1;
    }

    public ArrayList getLista1() {
        return lista1;
    }

    public void setLista1(ArrayList lista1) {
        this.lista1 = lista1;
    }

    public Date getFecha_creacion() {
        fecha_creacion = new Date();
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        fecha_creacion = new Date();
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_modificacion() {
        fecha_modificacion = new Date();
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        fecha_modificacion = new Date();
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
        return "Carpeta{" + "lista=" + lista1 +  '}';
    }

}
