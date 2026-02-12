package com.gestionestudiantes;
import java.util.HashMap;
import java.util.Map;

public class GestionEstudiantes {
    private Map<String, Estudiante> estudiantes = new HashMap<>();

    public GestionEstudiantes(){ }

    public void ingresarEstudiantes(String carnet, String nombreCompleto){
        Estudiante nuevoEstudiante = new Estudiante(carnet, nombreCompleto);
        estudiantes.put(carnet, nuevoEstudiante);
        System.out.println("Estudiante ingresado exitosamente: " + nuevoEstudiante);
    }

    public void buscarEstudiantes(String carnet) {
        if (estudiantes.containsKey(carnet)) {
            System.out.println("Estudiante encontrado: " + estudiantes.get(carnet));
        } else {
            System.out.println("No se encontró el carnet: " + carnet);
        }
    }

    public void eliminarEstudiante(String Eliminarcarnet) {
        if (estudiantes.containsKey(Eliminarcarnet)) {
            Estudiante eliminado = estudiantes.remove(Eliminarcarnet);
            System.out.println("Estudiante eliminado: " + eliminado);
        } else {
            System.out.println("No se encontró el carnet: " + Eliminarcarnet);
        }
    }

    public void mostrarTodosEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes registrados:");
            for (Estudiante e : estudiantes.values()) {
                System.out.println(e);
            }
        }
    }
}
