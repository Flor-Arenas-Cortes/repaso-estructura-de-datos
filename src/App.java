import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
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
    }
}
