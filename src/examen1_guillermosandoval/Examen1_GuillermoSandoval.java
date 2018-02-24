/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_guillermosandoval;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Memo
 */
public class Examen1_GuillermoSandoval {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carpeta c = new Carpeta();
        ArrayList lista = new ArrayList();
        String ingresa = "";
        int flag = 0;
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("Usuario: ");
        String usuario = sc.next();
        System.out.println("Tamano en bytes: ");
        byte size = sc.nextByte();
        System.out.println("Carpeta root: ");
        String carpetaraiz = sc.next();
        System.out.println("");
        if (flag == 0) {
            carpetaraiz = "root";
        }
        lista.add(new Carpeta());
        ((Carpeta) lista.get(0)).getLista1().add(new Archivo(carpetaraiz) {
            @Override
            public void fecha_creacion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void fecha_modificacion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        System.out.println(usuario + "/" + carpetaraiz + "/");
        do {
            ingresa = sc.next();
            if (ingresa.contains("mkdir")) {
                carpetaraiz = ingresa.substring(5, ingresa.length() - 2);
                for (Object temp : lista) {
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Carpeta) lista.get(i)).getLista1().contains(carpetaraiz)) {
                            ((Carpeta) lista.get(i)).getLista1().add(new Archivo(carpetaraiz) {
                                @Override
                                public void fecha_creacion() {
                                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                }

                                @Override
                                public void fecha_modificacion() {
                                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                }
                            });
                            System.out.println(lista.get(i));
                        }
                    }
                }
            } else if (ingresa.contains("cat") && ingresa.contains(".txt")) {
                carpetaraiz = ingresa.substring(3, ingresa.length() - 2);
                System.out.println("Ingrese texto");
                String texto = sc.next();
                for (int i = 0; i < lista.size(); i++) {
                    ((Carpeta) lista.get(i)).getLista1().add(new ArchivodeTexto(texto) + ".txt");
                }
            } else if (ingresa.contains("cat") && ingresa.contains(".exec")) {

            } else if (ingresa.contains("mod")) {

            } else if (ingresa.contains("cd")) {

            } else if (ingresa.equalsIgnoreCase("cd..")) {
                for (Object object : lista) {
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(((Archivo)lista.get(i)).getNombre());
                    }
                }
            } else if (ingresa.equalsIgnoreCase("ls")) {
                for (Object temp : lista) {
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Carpeta) lista.get(i)).getLista1().equals(temp)) {
                            System.out.println(((Carpeta) lista.get(i)).getLista1().get(i));
                        }
                    }
                }
            } else if (ingresa.contains("del")) {
                carpetaraiz = ingresa.substring(3, ingresa.length() - 2);
                for (int i = 0; i < lista.size(); i++) {
                    if (((Archivo) lista.get(i)).getNombre().equalsIgnoreCase(carpetaraiz)) {
                        lista.remove(i);
                    }
                }
            } else if (ingresa.equalsIgnoreCase("exec")) {

            }
        } while (ingresa.contains("exit"));
        System.out.println(lista);
    }//fin main

}//fin class
