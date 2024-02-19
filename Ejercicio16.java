import java.util.*;
public class Ejercicio16 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Digita la nota de tu examen");
double a=leer.nextDouble();
if(a<3.0){
System.out.println("Perdiste el examen");
}else{
    System.out.println("Ganaste el examen");
}
    }
}
