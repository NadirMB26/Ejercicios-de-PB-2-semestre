import java.util.*;
public class Ejercicio6{
public static void main(String[]args){
Scanner leer=new Scanner(System.in);

int a,d=3,e=0,r;

for (int i=1; i<=d; i++){
System.out.println("Digita el numero "+i);
a=leer.nextInt();
e+=a;
}
r=e/3;
System.out.println( "la media aritmética de los numeros ingresados es "+r);
}
}
