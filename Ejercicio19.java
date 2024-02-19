import java.util.*;
public class Ejercicio19 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
double a,b,c,d;
System.out.println("Digita el sueldo del empleado");
a=leer.nextDouble();
System.out.println("Digita el monto por horas extra");
b=leer.nextDouble();
c=a+b;
d=c*0.20;
double tf=c-d;
System.out.println("Sueldo básico: " + a);
System.out.println("Total del descuento: " + d);
System.out.println("Total ganado: " + tf);
    }
}
