import java.util.*;
public class Ejercicio31 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
double a,b,c;
System.out.println("Ingresa la base");
a=leer.nextDouble();
System.out.println("Ingresa la altura");
b=leer.nextDouble();
double area= 0.5 * a * b;
System.out.println("El area en milimetros cuadrados es: "+area);
System.out.println("El area en centimetros cuadrados es: "+(area/100));
System.out.println("El area en metros cuadrados es:"+(area/100)/10000);
    }
  
}