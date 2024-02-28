import java.util.*;
public class Ejercicio32 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double a,b,c;
        System.out.println("Ingrese el largo del rectángulo en metros: ");
        a=leer.nextDouble();
        System.out.println("Ingrese el ancho del rectángulo en metros");
        b=leer.nextDouble();
        double area=  a * b;
        System.out.println("El area en milimetros cuadrados es: "+area);
        System.out.println("El area en centimetros cuadrados es: "+(area*10000));
        System.out.println("El area en metros cuadrados es:"+(area*10000)*100);
    }
}
