import controlador.Ordenador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Paciente;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //lista para almacenar datos
        ArrayList<Paciente> pacientes = new ArrayList<>();
        // Registros ejemplo
        pacientes.add(new Paciente("EXP005", "Carlos Ruiz", 35, "Pediatria", 4));
        pacientes.add(new Paciente("EXP002", "Ana Lopez", 25, "Medicina General", 3));
        pacientes.add(new Paciente("EXP004", "Maria Torres", 42, "Cardiologia", 6));
        pacientes.add(new Paciente("EXP001", "Luis Perez", 30, "Dermatologia", 2));
        pacientes.add(new Paciente("EXP003", "Sofia Garcia", 28, "Nutricion", 5));

        System.out.println("SISTEMA DE ORDENAMIENTO DE PACIENTES");
        // Selecciona algoritmo
        System.out.println("\nSelecciona el algoritmo:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int algoritmo = entrada.nextInt();
        // Selecciona criterio
        System.out.println("\nSelecciona el criterio:");
        System.out.println("1. Numero de expediente");
        System.out.println("2. Nombre");
        System.out.println("3. Edad");
        System.out.println("4. Numero de consultas");
        int criterio = entrada.nextInt();
        // Selecciona sentido
        System.out.println("\nSelecciona el orden:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        int opcion = entrada.nextInt();

        boolean ascendente = true;

        if (opcion == 2) {
            ascendente = false;
        }

        // Muestra pacientes originales
        System.out.println("\nLISTA ORIGINAL DE PACIENTES");

        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }

        // Ejecuta el algoritmo seleccionado
        if (algoritmo == 1) {
            Ordenador.bubbleSort(pacientes, criterio, ascendente);
        } else if (algoritmo == 2) {
            Ordenador.selectionSort(pacientes, criterio, ascendente);
        } else if (algoritmo == 3) {
            Ordenador.insertionSort(pacientes, criterio, ascendente);
        } else {
            System.out.println("Opcion de algoritmo no valida");
            entrada.close();
            return;
        }

        // Muestra lista ordenada
        System.out.println("\nLISTA DE PACIENTES ORDENADA");

        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }

        entrada.close();
    }
}
