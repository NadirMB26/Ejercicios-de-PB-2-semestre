import java.util.*;
public class Ejercicio27 {
    public static void main(String []args){
Scanner leer=new Scanner(System.in);
String a,b;
System.out.println("Digita tu nombre");
a=leer.nextLine();
System.out.println("Introduce tu género M para masculino, F para femenino:");
b=leer.nextLine();
switch (b) {
    case "M":
        System.out.println("Bienvenido " + a);
        break;
    case "F":
        System.out.println("Bienvenida " + a);
        break;
    default:
        System.out.println("Hola indeciso");
        break;
}
}
}
