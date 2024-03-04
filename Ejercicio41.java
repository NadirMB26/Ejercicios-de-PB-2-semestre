import java.util.*;
public class Ejercicio41 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double edad;
        System.out.println("Ingresa tu edad");
        edad=leer.nextDouble();
        double meses=edad*12;
        double metros=meses*0.005;
        System.out.println("Su cabellera mide unos "+metros);


    }
}
