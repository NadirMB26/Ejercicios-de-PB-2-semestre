import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1,num2,suma,resta,multiplicacion,division,modulo;
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextDouble();
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        modulo = num1 % num2;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Resto (módulo): " + modulo);
    }
}