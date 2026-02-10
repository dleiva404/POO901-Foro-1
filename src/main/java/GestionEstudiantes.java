import java.util.HashMap;
import java.util.Map;

public class GestionEstudiantes {
    private Map<String, Estudiante> estudiantes = new HashMap<>();
    public GestionEstudiantes(){ }

    //--Método--Ingresar--
    public void ingresarEstudiantes(String carnet, String nombreCompleto){
        Estudiante nuevoEstudiante = new Estudiante(carnet, nombreCompleto);
        estudiantes.put(carnet, nuevoEstudiante);
        System.out.println("Estudiante ingresado exitosamente: " + nuevoEstudiante);
    }

//Método--Buscar--

    public void buscarEstudiantes(String carnetBuscar){
        if (estudiantes.containsKey(carnetBuscar)){
            System.out.println(estudiantes.get(carnetBuscar));
        }
        else  {
            System.out.println("Estudiante no encontrado, nose puede mostrar");
        }
    }
}

