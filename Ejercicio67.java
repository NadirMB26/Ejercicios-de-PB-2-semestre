import java.util.Scanner;

public class Ejercicio67 {
      public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a = leer.nextInt();
         long suma = 1;
        for (int i = 1; i <=a; i++) {
            suma *= i;
            //System.out.println(suma+"+="+i);
        }
        System.out.println("El factorial de " + (a)+ " es: " + suma);
    }
}
