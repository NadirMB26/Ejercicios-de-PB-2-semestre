import java.util.Scanner;
public class Ejercicio66 {
       public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a = leer.nextInt();
        int suma = 0;
        for (int i = 1; i <=2*a-1; i++) {
            suma += i;
            //System.out.println(suma+"+="+i);
        }
        System.out.println("La suma de los números impares desde 1 hasta " + (2*a-1)+ " es: " + suma);
    }
}
