import java.util.*;
public class Ejercicio5 {
    
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
double a,b,c;
System.out.println("Ingrese la diagonal mayor: ");
a=leer.nextDouble();
System.out.println("Ingrese la diagonal menor: ");
b=leer.nextDouble();
c=(a*b)/2;
System.out.println("El área del rombo es: "+ c);
    }
}
