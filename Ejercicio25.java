import java.util.*;
public class Ejercicio25 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Ingresa los grados centigrados");
int b,a=leer.nextInt();
b=((a*9)/5)+32;
System.out.println("La convercion a grados fahrenheit dio como resultado: "+b+"F");
    }
}
