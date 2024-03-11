import java.util.*;
public class Ejercicio65 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a = leer.nextInt();
        int suma = 0;
        for (int i = 0; i <= a; i++) {
            suma += i;
            //System.out.println(suma+"+="+i);
        }
        System.out.println("La suma de los números desde 1 hasta " + a + " es: " + suma);
    }
}
