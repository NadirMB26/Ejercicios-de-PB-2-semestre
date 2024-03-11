import java.util.Scanner;

public class Ejercicio68 {
public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a = leer.nextInt();
         long suma = 0;
        for (int i = 1; i <=a; i++) {
            long factorial=1;
            for(int b=1; b<=i; b++){
                factorial*=b;
            }
            suma+=factorial;
        }
        System.out.println("la suma de factoriales de 1 hasta " + (a)+ " es: " + suma);
    }  
}
