import java.util.*;
public class Ejercicio55{
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();
        primeNumber(numero);
    }
    public static void primeNumber(int num) {
        boolean prime = true; 
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println("Tu numero es primo");
        else
            System.out.println("Tu numero no es primo");
    }
       
   
}
