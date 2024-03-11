import java.util.*;
public class Ejercicio73 {
 public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Digita el salario del trabajador");
double salario=leer.nextDouble();
if(salario<=1000){
    double pago=salario-(salario*0.1);
System.out.println("Su pago es: 10% "+pago);
}else if (salario>1000 && salario<=2000) {
    double pago=salario-(salario*0.15);
System.out.println("Su pago es: 15% "+pago);
}else if(salario>2000){
    double pago=salario-(salario*0.13);
System.out.println("Su pago es: 13% "+pago);
}
 }   
}
