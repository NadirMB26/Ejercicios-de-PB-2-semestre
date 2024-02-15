import java.util.*;
public class Ejercicio4 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
double a,b,c;
System.out.println("Ingresa el diametro");
a=leer.nextDouble();
double pi=3.1416;
b= a/2;
c=pi*(b*b);
System.out.println("El area del circulo es: "+c+" cm " );
    }
}
