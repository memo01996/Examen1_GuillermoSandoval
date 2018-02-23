/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_guillermosandoval;

import java.util.ArrayList;
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
        ArrayList lista1 = new ArrayList();
        int flag = 0;
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("Usuario: ");
        String usuario = sc.next();
        System.out.println("Tamano en bytes: ");
        byte size = sc.nextByte();
        System.out.println("Carpeta root");
        String carpetaraiz = sc.next();
        System.out.println("");
        if (flag == 0){
            carpetaraiz = "root";
        }
        System.out.println(new SistemadeArchivos(nombre, usuario, size, carpetaraiz));
    }//fin main

}//fin class
