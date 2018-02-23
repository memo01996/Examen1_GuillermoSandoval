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
    private Date fecha_creacion;
    private Date fecha_modificacion;
    private Carpeta c;
    private ArchivodeTexto a;
    private Ejecutable e;

    public Archivo() {
    }

    public Archivo(String Nombre, int Size, Date fecha_creacion, Date fecha_modificacion, Carpeta c, ArchivodeTexto a, Ejecutable e) {
        this.Nombre = Nombre;
        this.Size = Size;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
        this.c = c;
        this.a = a;
        this.e = e;
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
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public Carpeta getCarpeta() {
        return c;
    }

    public void setCarpeta(Carpeta c) {
        this.c = c;
    }

    public ArchivodeTexto getArchivotexto() {
        return a;
    }

    public void setArchivotexto(ArchivodeTexto a) {
        this.a = a;
    }

    public Ejecutable getEjecutable() {
        return e;
    }

    public void setEjecutable(Ejecutable e) {
        this.e = e;
    }

    public abstract void fecha_creacion();

    public abstract void fecha_modificacion();

    @Override
    public String toString() {
        return "Archivo{" + "Nombre=" + Nombre + ", Size=" + Size + ", fecha_creacion=" + fecha_creacion + ", fecha_modificacion=" + fecha_modificacion + ", carpeta=" + c + ", archivotexto=" + a + ", ejecutable=" + e + '}';
    }

}
