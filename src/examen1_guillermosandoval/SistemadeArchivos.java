/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_guillermosandoval;

/**
 *
 * @author Memo
 */
public class SistemadeArchivos {

    private String nombre;
    private String usuario;
    private byte capacidad;
    private String carpetaraiz;

    public SistemadeArchivos() {
    }

    public SistemadeArchivos(String nombre, String usuario, byte capacidad, String carpetaraiz) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.capacidad = capacidad;
        this.carpetaraiz = carpetaraiz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public byte getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }

    public String getCarpetaraiz(String carpetaraiz) {
        return carpetaraiz;
    }

    public void setCarpetaraiz(String carpetaraiz) {
        this.carpetaraiz = carpetaraiz;
    }

    @Override
    public String toString() {
        return " " + usuario + "/" + carpetaraiz + " ";
    }

}
