import java.util.*;
public class Ejercicio3{
public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b,c;
System.out.println("Ingresar la base");
a=leer.nextInt();
System.out.println("Ingresar la altura");
b=leer.nextInt();
c=((a*b)/2);
System.out.println("Su area es de: "+ c);
}
}