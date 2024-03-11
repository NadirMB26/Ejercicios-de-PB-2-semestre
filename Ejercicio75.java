import java.util.*;
public class Ejercicio75 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int año = teclado.nextInt();
        boolean esBisiesto = calcularBisiesto(año);
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
    public static boolean calcularBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
