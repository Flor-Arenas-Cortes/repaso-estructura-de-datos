import java.util.LinkedList;
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
    /*
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
    */
        // Ejericio LinkendList - Lista enlzada simple de tareas

        //Creamos una LinkendList para las tareas
        LinkedList<String> tareas = new LinkedList<>();
        Scanner recibir = new Scanner(System.in);
        int opcion;

        //Menú principal
        do {
            System.out.println("\n1. Agregar tarea \n2. Eliminar primera tarea \n3. Mostrar tareas \n4. Salir");
            System.out.println("Elige una opción: ");
            opcion = recibir.nextInt(); //Leemos la opcion del usuario
            recibir.nextLine(); // Limpiamos el buffer

            switch (opcion) {
                case 1:
                    //Agregar una nueva tarea
                    System.out.println("Escribe la tarea: ");
                    String tarea = recibir.nextLine();
                    tareas.add(tarea);
                    break;
                case 2:
                    //Eliminar la primera tarea si existe
                    if (!tareas.isEmpty()){
                        System.out.println("Tarea eliminada: " + tareas.removeFirst());
                    } else {
                        System.out.println("No hay tareas para eliminar");
                    }
                    break;
                case 3: 
                //Mostrar todas las tareas
                System.out.println("Lista de tareas: ");
                for (String t : tareas){
                    System.out.println("- " + t);
                }
                break;
            } 
        } while (opcion != 4); // Repetir hasta que el usuario elija salir
    }
}
