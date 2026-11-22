package modelo;
//almacena los datos de cada paciente
public class Paciente {
    // Datos paciente
    private String numeroExpediente;
    private String nombre;
    private int edad;
    private String especialidad;
    private int consultas;
    // Constructor
    public Paciente(
        String numeroExpediente,
        String nombre,
        int edad,
        String especialidad,
        int consultas) {
        //atributo de la clase
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.consultas = consultas;
    }
    // Métodos para obtener datos
    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getConsultas() {
        return consultas;
    }

    // Mostrar información del paciente
    @Override
    public String toString() {
        return
        "Expediente: " + numeroExpediente + 
        "   Nombre: " + nombre +
        "   Edad: "+ edad +
        "   Especialidad: " + especialidad +
        "   Num. de consultas: " + consultas;
    }
}
