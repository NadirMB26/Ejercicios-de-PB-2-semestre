import java.util.*;
public class Ejercicio24 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
double pulgadas=2.54,a;
System.out.println("Ingresa las pulgadas");
a=leer.nextDouble();
System.out.println("Por el total de "+a+" pulgadas ingresadas tus centimetros son: "+(a*pulgadas)+"cm");
    }
}
