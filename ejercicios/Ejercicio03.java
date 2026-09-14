import java.util.Scanner; // Importación obligatoria para usar Scanner

public class Ejercicio03 {
    public static void main(String[] args) {
        // Inicializar el objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); // Lee texto completo

        // Solicitar la edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Lee un número entero

        // Mostrar el mensaje con el formato esperado
        System.out.println("Hola " + nombre + ",");
        System.out.println("Tienes " + edad + " años.");

        // Buenas prácticas: cerrar el scanner al finalizar
        scanner.close();
    }
}
