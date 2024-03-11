import java.util.*;
public class Ejercicio74 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a, b, c;
System.out.println("Ingrese el primer valor: ");
a = leer.nextInt();
System.out.println("Ingrese el segundo valor: ");
b = leer.nextInt();
System.out.println("Ingrese el tercer valor: ");
c = leer.nextInt();
if (a > b && a > c) {
    System.out.println("El número mayor es: " + a);
    if (b > c) {
        System.out.println("El número intermedio es: " + b);
        System.out.println("El número menor es: " + c);
    } else {
        System.out.println("El número intermedio es: " + c);
        System.out.println("El número menor es: " + b);
    }
} else if (b > a && b > c) {
    System.out.println("El número mayor es: " + b);
    if (a > c) {
        System.out.println("El número intermedio es: " + a);
        System.out.println("El número menor es: " + c);
    } else {
        System.out.println("El número intermedio es: " + c);
        System.out.println("El número menor es: " + a);
    }
} else {
    System.out.println("El número mayor es: " + c);
    if (a > b) {
        System.out.println("El número intermedio es: " + a);
        System.out.println("El número menor es: " + b);
    } else {
        System.out.println("El número intermedio es: " + b);
        System.out.println("El número menor es: " + a);
    }
}
    }
}
