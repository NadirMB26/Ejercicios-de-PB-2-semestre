import java.util.Scanner;

public class Ejercicio70 {
        public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a = leer.nextInt();
        int suma = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                suma-= i; 
            } else {
                suma+= i; 
            }
        }
        System.out.println("el resultado es: " + suma);
    }
}
