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
class ArchivodeTexto extends Archivo {

    private String texto;
    private Date fecha_creacion = new Date();
    private Date fecha_modificacion = new Date();

    public ArchivodeTexto() {
        super();
    }

    public ArchivodeTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void fecha_creacion() {
        fecha_creacion = new Date();
    }

    public void fecha_modificacion() {
        fecha_modificacion = new Date();
    }

    @Override
    public String toString() {
        return "ArchivodeTexto{" + "texto=" + texto + ", fecha_creacion=" + fecha_creacion + ", fecha_modificacion=" + fecha_modificacion + '}';
    }

}
