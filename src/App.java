import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*
        // Array (Arreglo) - Estructura indexada de tamaño fijo
        // Ejercicio de calificaciones

        //Declaramos un arreglo de 5 calificaciones
        double[] calificaciones = new double[5];
        Scanner sc = new Scanner(System.in);
        double suma = 0;

        //Pedimos al usuario ingresas 5 calificaciones
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones [i] = sc.nextDouble(); // Guardamos las calificaciones
            suma += calificaciones[i]; // Sumamos para calcular promedio después
        }

        //Calculamos el promedio
        double promedio = suma / calificaciones.length;

        //Mostrar el resultado
        System.out.println("El promedio es: " + promedio);
    */

        // ArrayList - Lista dinámica de nombres

        //Creamos un ArrayList para almacenar nombres
        ArrayList<String> nombres = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String entrada;

        System.out.println("Ingresa nombres (escribe 'salir' para terminar): ");
        while (true){
            entrada = leer.nextLine(); //Leemos entrada del usuario
            if (entrada.equalsIgnoreCase("salir")) break; //Si escribe "Salir", termina
            nombres.add(entrada); // Agregamos el nombre a la lista
        }

        //Mostramos los nombre ingresados
        System.out.println("Nombres ingresados: ");
        for (String nombre : nombres){
            System.out.println("El nombre ingresado fue: " + nombre);
        }
    }
}
