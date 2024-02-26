import java.util.*;
public class Ejercicio26 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Ingresa el cateto 1");
double a=leer.nextInt();
System.out.println("Ingresa el cateto 2");
double b=leer.nextInt();
double c = a * a + b * b;
System.out.println("El cuadrado de la hipotenusa es " + c);
    }
}
