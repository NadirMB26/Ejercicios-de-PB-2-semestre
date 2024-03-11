import java.util.*;
public class Ejercicio47 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double precioO,precioP,descuento;
        System.out.print("Introduce el precio original de la compra: ");
        precioO = leer.nextDouble();
        System.out.print("Introduce el precio pagado: ");
        precioP = leer.nextDouble();
        descuento = ((precioO - precioP) / precioO) * 100;
        System.out.printf("El porcentaje de descuento es: %.2f%%", descuento);
    }
}
