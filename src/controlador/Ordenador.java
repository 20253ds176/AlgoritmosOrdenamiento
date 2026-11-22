
package controlador;
import java.util.ArrayList;
import modelo.Paciente;

public class Ordenador {

    //ordena pacientes por edad(Bubble Sort)
    public static void bubbleSort(ArrayList<Paciente> pacientes) {
        bubbleSort(pacientes, 3, true);
    }

    //ordena pacientes por edad(Selection Sort)
    public static void selectionSort(ArrayList<Paciente> pacientes) {
        selectionSort(pacientes, 3, true);
    }

    //ordena pacientes por edad(Insertion Sort)
    public static void insertionSort(ArrayList<Paciente> pacientes) {
        insertionSort(pacientes, 3, true);
    }

    // Bubble Sort con diferentes criterios
    public static void bubbleSort(ArrayList<Paciente> pacientes, int criterio, boolean ascendente) {
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < pacientes.size() - 1; i++) {
            for (int j = 0; j < pacientes.size() - 1 - i; j++) {
                comparaciones++;

                if (comparar(pacientes.get(j), pacientes.get(j + 1), criterio, ascendente) > 0) {
                    Paciente temporal = pacientes.get(j);
                    pacientes.set(j, pacientes.get(j + 1));
                    pacientes.set(j + 1, temporal);
                    intercambios++;
                }
            }
        }

        System.out.println("\nRESULTADO DE BUBBLE SORT");
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }

    // Selection Sort con diferentes criterios
    public static void selectionSort(ArrayList<Paciente> pacientes, int criterio, boolean ascendente) {
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < pacientes.size() - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < pacientes.size(); j++) {
                comparaciones++;

                if (comparar(
                    pacientes.get(j),
                    pacientes.get(menor),
                    criterio, ascendente) < 0) {
                    menor = j;
                }
            }

            if (menor != i) {
                Paciente temporal = pacientes.get(i);
                pacientes.set(i, pacientes.get(menor));
                pacientes.set(menor, temporal);
                intercambios++;
            }
        }

        System.out.println("\nRESULTADO DE SELECTION SORT");
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }

    // Insertion Sort con diferentes criterios
    public static void insertionSort(ArrayList<Paciente> pacientes, int criterio, boolean ascendente) {
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 1; i < pacientes.size(); i++) {
            Paciente actual = pacientes.get(i);
            int j = i - 1;

            while (j >= 0) {
                comparaciones++;

                if (comparar(
                    pacientes.get(j),
                    actual,
                    criterio,
                    ascendente) > 0) {
                    pacientes.set(j + 1, pacientes.get(j));
                    j--;
                    intercambios++;
                } else {
                    break;
                }
            }

            pacientes.set(j + 1, actual);
        }

        System.out.println("\nRESULTADO DE INSERTION SORT");
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Movimientos: " + intercambios);
    }

    // Compara los datos de los pacientes
    private static int comparar(Paciente p1, Paciente p2, int criterio, boolean ascendente) {

        int resultado = 0;

        if (criterio == 1) {
            resultado = p1.getNumeroExpediente().compareToIgnoreCase(p2.getNumeroExpediente());
        } else if (criterio == 2) {
            resultado = p1.getNombre().compareToIgnoreCase(p2.getNombre());
        } else if (criterio == 3) {
            resultado = Integer.compare(p1.getEdad(), p2.getEdad());
        } else if (criterio == 4) {
            resultado = Integer.compare(p1.getConsultas(), p2.getConsultas());
        }

        if (!ascendente) {
            resultado = resultado * -1;
        }

        return resultado;
    }
}
