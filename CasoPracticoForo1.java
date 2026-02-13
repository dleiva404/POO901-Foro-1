/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.foro1;

import java.util.ArrayList;

/**
 *
 * @author Norma Garcia
 */
public class CasoPracticoForo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de List
        ArrayList<String> colores = new ArrayList<>();
        //Agregar valores
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Negro");
        colores.add("Rojo");
        colores.add("Blanco");
        //impresion de lista.
        System.out.println("Mi Lista de Colores");
        System.out.println(colores);
        
        //eliminado por posicion
        colores.remove(2);
        System.out.println("Mi Nueva Lista de Colores 1");
        System.out.println(colores);
        
        //eliminado por objeto
        colores.remove("Rojo");
        System.out.println("Mi Nueva Lista de Colores 2");
        System.out.println(colores);
        
        //vaciar toda la Lista
         colores.clear();
         System.out.println(" Lista vacia");
        
       
       
        
    }
    
}
