import java.util.*;
public class Ejercicio10{
public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b,c;
System.out.println("Ingresa la base");
a=leer.nextInt();
System.out.println("ingresar la altura");
b=leer.nextInt();
c=(a*b)/2;
System.out.println("El area del triangulo es "+c);
}
}