import java.util.*;
public class Ejercicio20 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b=0;
for(int i=1 ;i<=5; i++){
System.out.println("Digita la nota munero["+i+"]");
a=leer.nextInt();
b+=a;
}
System.out.println("La suma de4 las notas es: "+b);
System.out.println("El promedio de las notas es "+ (b/5));
System.out.println("El doble de las notas es: "+(b*2));
    }
}
