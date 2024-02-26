import java.util.*;
public class Ejercicio22 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double a;
        System.out.println("Ingresa tu numero");
        a=leer.nextDouble();
      
        int b = (int) a;
        double c = a - b;
        System.out.println("La parte entera de tu numero es: "+b);
        System.out.println("La parte decimal de tu numero es: "+c);
    }
}
