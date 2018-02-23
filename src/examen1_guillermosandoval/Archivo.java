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
public abstract class Archivo {

    private String Nombre;
    private int Size;
    private Date fecha_creacion = new Date();
    private Date fecha_modificacion = new Date();

    public Archivo() {
    }

    public Archivo(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion = new Date();
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion = new Date();
    }

    public abstract void fecha_creacion();

    public abstract void fecha_modificacion();

    @Override
    public String toString() {
        return "Archivo{" + "Nombre=" + Nombre + ", fecha_creacion=" + fecha_creacion + ", fecha_modificacion=" + fecha_modificacion + '}';
    }

}
