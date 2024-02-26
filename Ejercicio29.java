import java.util.*;
public class Ejercicio29 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digita un numero");
        float numero =leer.nextFloat();
        float cubo = (numero*numero*numero);
        System.out.println("El cubo de " + numero + " es " + cubo);
    }
}
