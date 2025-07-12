import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicios del primer PDF
        System.out.println("\n=== Conversión de Temperatura ===");
        System.out.print("Ingrese temperatura en Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.printf("Temperatura en Celsius: %.2f\n", fahrenheitACelsius(fahrenheit));

        System.out.println("\n=== Cálculo de Hipotenusa ===");
        System.out.print("Ingrese longitud del primer cateto: ");
        int catetoA = scanner.nextInt();
        System.out.print("Ingrese longitud del segundo cateto: ");
        int catetoB = scanner.nextInt();
        System.out.printf("La hipotenusa mide: %.2f\n", hipotenusa(catetoA, catetoB));

        System.out.println("\n=== Lanzamiento de Dados ===");
        System.out.println("La suma de los dados es: " + lanzarDados());

        scanner.nextLine(); // Limpiar buffer

        // Problema 2: Procesamiento de nombres
        System.out.println("\n=== Procesamiento de Nombres ===");
        System.out.print("Ingrese su nombre completo (nombre y apellido): ");
        String nombreCompleto = scanner.nextLine();
        procesarNombre(nombreCompleto);

        scanner.close();
    }

    // 1. Conversión de Fahrenheit a Celsius
    public static double fahrenheitACelsius(double gradosFahrenheit) {
        return 5.0 / 9.0 * (gradosFahrenheit - 32);
    }

    // 2. Cálculo de hipotenusa
    public static double hipotenusa(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    // 3. Lanzamiento de dados
    public static int lanzarDados() {
        int dado1 = (int)(Math.random() * 6) + 1;
        int dado2 = (int)(Math.random() * 6) + 1;
        System.out.println("Dado 1: " + dado1 + " | Dado 2: " + dado2);
        return dado1 + dado2;
    }

    // Problema 2: Procesamiento de nombres
    public static void procesarNombre(String nombreCompleto) {
        String[] partes = nombreCompleto.split(" ");
        if (partes.length >= 2) {
            String nombre = partes[0];
            String apellido = partes[partes.length - 1]; // Para manejar múltiples apellidos
            char inicial = nombre.charAt(0);
            System.out.println("Nombre formateado: " + apellido + ", " + inicial + ".");
        } else {
            System.out.println("Debe ingresar al menos un nombre y un apellido");
        }
    }
}