import java.util.*;
public class Ejercicio43 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b;
System.out.println("Digita tu numero [1]");
a=leer.nextInt();
System.out.println("Digita tu numero [2]");
b=leer.nextInt();
if(a>b){
    System.out.println("El número menor entre " + a+ " y " + b + " es: " + b);
}else{
    System.out.println("El número menor entre " + a+ " y " + b + " es: " + a);
}
    }
}
