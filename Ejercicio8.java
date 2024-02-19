import java.util.*;
public class Ejercicio8{
public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Digita el numero");
int a,b;
a=leer.nextInt();
b=a/2;
if(b==1){
System.out.println("El Numero es entero y su resultado es "+b);
}else{
System.out.println("Error El Numero ingresado no es entero");
}
}
}
