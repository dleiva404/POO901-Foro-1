public class Estudiante {
    private String carnet;
    private String nombreCompleto;


    public Estudiante (String carnet, String nombreCompleto) {
        this.carnet = carnet;
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Carnet: " + this.carnet + " Nombre: " + this.nombreCompleto;
    }
}


