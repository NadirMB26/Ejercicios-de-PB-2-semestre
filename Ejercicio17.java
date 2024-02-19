import java.util.*;
public class Ejercicio17 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b;
System.out.println("Digita el numero 1");
a=leer.nextInt();
System.out.println("Digita el numero 2");
b=leer.nextInt();
if(a<b){
    System.out.println("El mayor es b "+b);
}else{
    System.out.println("El mayor es a "+a);
}
    }
}
