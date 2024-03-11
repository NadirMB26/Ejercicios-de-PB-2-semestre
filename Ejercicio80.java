import java.util.Scanner;
public class Ejercicio80 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numeroEntero = teclado.nextInt();
        System.out.println("Ingrese un número real: ");
        double numeroReal = teclado.nextDouble();
        System.out.println("Datos ingresados:");
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número real: " + numeroReal);
    }
}
