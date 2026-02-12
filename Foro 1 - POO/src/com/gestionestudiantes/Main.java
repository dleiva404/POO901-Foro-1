package com.gestionestudiantes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Estudiantes ---");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar todos los estudiantes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese carnet: ");
                    String carnet = sc.nextLine();
                    System.out.print("Ingrese nombre completo: ");
                    String nombre = sc.nextLine();
                    gestion.ingresarEstudiantes(carnet, nombre);
                    break;
                case 2:
                    System.out.print("Ingrese carnet a buscar: ");
                    String carnetBuscar = sc.nextLine();
                    gestion.buscarEstudiantes(carnetBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese carnet a eliminar: ");
                    String Eliminarcarnet = sc.nextLine();
                    gestion.eliminarEstudiante(Eliminarcarnet);
                    break;
                case 4:
                    gestion.mostrarTodosEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
