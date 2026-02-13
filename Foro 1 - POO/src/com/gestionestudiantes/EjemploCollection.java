package com.desafio1;


import java.util.HashSet;

public class EjemploCollection {

    public static void main(String[] args) {
        
        HashSet<String> listado = new HashSet<>();
        
        //String Elemento
        String elm = "Elemento";

        
//Agregando datos

        System.out.println("\n Elementos inciales: \n");
        
             System.out.println("Cantidad de Elementos: " + listado.size());
             
             //Agregando 9 "Elementos"
        for (int i = 0; i < 9 ; i++){
        listado.add("Elemento" + i);
 
         //Imprimiendo elementos guardados hasta el momento
         System.out.println(elm + i);
    }
        
 //Imprimiendo cantidad de elementos guardados hasta este momento
        
                System.out.println("\nCantidad de Elementos: " + listado.size());


                 
                
                //Editando la lista
                   System.out.println("\nTodos los elementos editados con métodos: \n");
                   
                   
                   
                      //Agregando duplicados
        
                listado.add("Elemento7");
                listado.add("Elemento2");
                
                        //Agregando "EXTRAS"
                 listado.add("ElementoEXTRA1");
                 listado.add("ElementoEXTRA2");
                 listado.add("ElementoEXTRA3");
                                
                    //Eliminando Elemento0  
                listado.remove("Elemento0");
                


                        
              System.out.println(listado);
              
              //Imprimiendo cambios del Set
              
                 System.out.println("\nCantidad de Elementos ya editados: " + listado.size());
        
                 listado.clear();
               System.out.println("\nCantidad de Elementos ya limpiados: \n" + listado.size());

                 System.out.println(listado);
        
