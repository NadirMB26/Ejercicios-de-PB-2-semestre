import java.util.*;
public class Ejercicio52 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b;
System.out.println("Ingresa un numero");
a=leer.nextInt();
for(int i=0;i<=10;i++){
    b=a*i;
    System.out.println(a+" x "+i+" = "+ b);
}
    }
}
