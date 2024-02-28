import java.util.*;
public class Ejercicio39 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Ingresa tu nombre");
String nombre=leer.next();
int nacimiento,actual;
System.out.println("Ingresa tu fecha de nacimiento");
nacimiento=leer.nextInt();
System.out.println("Ingresa la fecha actual");
actual=leer.nextInt();
int años=actual-nacimiento;
int dias=años*365;
double porcentaje= dias*0.34;
String sindecimal = String.format("%.0f",porcentaje);
System.out.println(nombre+" el 34% de su vida ha estado durmiendo eso es equivalente a "+sindecimal+" dias");

}
}
