import java.util.*;
public class Ejercicio61 {
public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a=0,b,c=0,d;
do{
if(c<10){
c++;
System.out.println("Digita el numero que quieres elevar al cuadrado");
a=leer.nextInt();
if(a<0){
System.out.println("Los dies primeros numeros no pueden ser menores que 0");
break;
}
elevaralcuadrado(a);
}else{
System.out.println("Digita el numero que quieres elevar al cuadrado");
a=leer.nextInt();  
elevaralcuadrado(a);
}   
System.out.println("Para salir digita [0], si deceas continuar digita [1]");
b=leer.nextInt();
}while(b!=0);
}
public static void elevaralcuadrado(int entero){
int cuadrado=entero*entero;
System.out.println("Tu numero ["+entero+"] elevado al cuadrado es "+cuadrado);
}
}