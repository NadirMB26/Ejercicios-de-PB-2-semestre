import java.util.*;
public class Ejercicio63 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
       int a,b=0;
       do{
        System.out.println("Ingrese valores enteros. Introduzca 0 para finalizar.");
        System.out.println("Digita tu numero");
        a=leer.nextInt();
        if (a > 0) {
            b+=a;
        }
       }while((a<=20||a>30)&& a!=0);
       System.out.println("La suma de los valores mayores a 0 introducidos es: " + b);
    }
}
