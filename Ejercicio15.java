import java.util.*;
public class Ejercicio15 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    int a;
System.out.println("Digita tu año de nacimiento");
a=leer.nextInt();
if(2024-a<18){
    System.out.println("Tienes "+(2024-a)+" años y eres menor de edad");
}else{
    System.out.println("Tienes "+(2024-a)+" años y eres mayor de edad"); 
}
}
}
