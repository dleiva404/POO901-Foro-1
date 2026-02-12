package Ejemplos;
import java.util.HashMap;

public class EjemplosHashMap {
     public static void main(String[] args) {
         // --Número de Dorsal y Nombre---
         HashMap<Integer, String> triatlon = new HashMap<>();

         //--Insertamos la información básica--
         triatlon.put(10,"Juan Galindo");
         triatlon.put(20,"Alex Quan");
         triatlon.put(30,"Pedro Cárcamo");

         //--Buscaremos un atleta--
         int dorsal = 30;
         System.out.println("El atleta es: " + triatlon.get(dorsal));

         //--Eliminamos un atleta--
         triatlon.remove(10);

         //--Imprime el total--
        System.out.println("Total en la competencia: " + triatlon.size());
        System.out.println("Lista: " + triatlon);

     }
}
