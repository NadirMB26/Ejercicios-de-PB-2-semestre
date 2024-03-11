import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el monto: ");
        double montoOriginal = leer.nextDouble();

        double descuento;
        if (montoOriginal > 10000) {
       
            descuento = montoOriginal * 0.2;
        } else {
     
            descuento = montoOriginal * 0.1;
        }

        double precioFinal = montoOriginal - descuento;

        System.out.println("El descuento es: $" + descuento);
        System.out.println("El precio final es: $" + precioFinal);
    }
}
