import java.util.*;
public class Ejercicio42 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double vn=0.05,kr,pn=6;
        System.out.println("Ingresa los voltios requeridos para el sistema de iluminacion");
        kr=leer.nextDouble();
        double kr2=kr*1000;
        double nn=(kr2/vn);
        double pesok=nn*pn/1000;
        double pesot=pesok/1000;
        System.out.println("Numero de naranjas necesarias: "+nn);
        System.out.println("Peso en toneladas: "+pesot+" toneladas");
    }
}
