import java.util.*;
public class Ejercicio60 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b=0;
do{
System.out.println("Ingresa un numero");
a=leer.nextInt();
if(a>0){
b+=1;
}
}while(a!=0);
System.out.println("el número de valores mayores que cero leídos fue: "+b);
    }
}
