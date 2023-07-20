import java.io.*;
import java.util.*;

public class Pograma {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        PrintStream outputStream = System.out;

        List<String> nombres = new ArrayList<>();
        Map<String, String> telefonos = new HashMap<>();
        LinkedList<String> historial = new LinkedList<>();

        try {
            outputStream.println("¡Bienvenido al programa de ejemplo!");

            while (true) {
                outputStream.println("\nMenú:");
                outputStream.println("1. Agregar un nombre");
                outputStream.println("2. Buscar un nombre");
                outputStream.println("3. Ver Historial");
                outputStream.println("4. Salir");
                outputStream.print("Ingrese una opción: ");
                String opcionStr = reader.readLine();
                int opcion = Integer.parseInt(opcionStr);

                if (opcion == 1) {
                    outputStream.print("\nIngrese un nombre: ");
                    String nombre = reader.readLine();
                    nombres.add(nombre);

                    outputStream.print("Ingrese el teléfono asociado: ");
                    String telefono = reader.readLine();
                    telefonos.put(nombre, telefono);

                    historial.add("Se agregó el nombre '" + nombre + "'");
                } else if (opcion == 2) {
                    outputStream.print("\nIngrese un nombre a buscar: ");
                    String nombre = reader.readLine();
                    String telefono = telefonos.get(nombre);
                    if (telefono != null) {
                        outputStream.println("Teléfono encontrado: " + telefono);
                    } else {
                        outputStream.println("El nombre no existe en la lista.");
                    }
                    historial.add("Se buscó el nombre '" + nombre + "'");
                } else if (opcion == 3) {
                    outputStream.println("\nHistorial de operaciones:");
                    for (String operacion : historial) {
                        outputStream.println(operacion);
                    }
                }else if(opcion == 4){
                    break;
                }else {
                    outputStream.println("\nOpción inválida. Intente nuevamente.");
                }
            }
        } catch (IOException e) {
            outputStream.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            outputStream.println("Error de formato: la opción debe ser un número.");
        } finally {
            try {
                reader.close();
                outputStream.close();
            } catch (IOException e) {
                // Manejo de errores de cierre
            }
        }


    }
}
