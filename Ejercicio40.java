import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilos de oro: ");
        double kilos = leer.nextDouble();

        System.out.print("Ingrese el precio en pesos por onza de oro: ");
        double pOnza = leer.nextDouble();
        double gramos = kilos * 1000;
        double Pesos = (gramos / 28.3495) * pOnza;

        System.out.println("El valor en pesos es: $" + Pesos);
}}

