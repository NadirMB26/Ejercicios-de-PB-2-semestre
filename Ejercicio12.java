import java.util.*;
public class Ejercicio12 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a=0,b,c=0,d=3;
for(int i=1; i<=d; i++){
System.out.println("Ingresa tu numero ["+i+"]");
a=leer.nextInt();
if(i<3){
System.out.println("El numero elevado es["+(i+1)+"] ="+(a*(i+1)));}

c+=a;

    }
  
    System.out.println("El numero elevado es["+(4)+"] ="+a*a);
    System.out.println("La suma es "+c+" ,el promedio es "+(c/d));
    }
}
