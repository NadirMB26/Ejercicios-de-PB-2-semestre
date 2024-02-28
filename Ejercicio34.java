import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[]args){
              Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra:");
        double a = leer.nextDouble();

        double b;
        if (a > 1000) {
            b =a* 0.10;  
        } else if (a > 500) {
            b = a * 0.20;  
        } else {
            b = 0;  
        }

        double c = a - b;

        System.out.println("El descuento es: " + b);
        System.out.println("El monto final después del descuento es: " + c);
    }
}
