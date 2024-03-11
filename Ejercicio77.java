import java.util.*;
public class Ejercicio77 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Ingrese el capital del préstamo (C): ");
double capital = leer.nextDouble();
System.out.println("Ingrese la tasa de interés anual (R): ");
double tasaInteresAnual = leer.nextDouble();
double tasaInteresMensual = tasaInteresAnual / 12 / 100;
System.out.println("Ingrese el número de años (N): ");
double numaños = leer.nextInt();
double numPagos = numaños * 12;
double cuotaMensual = capital * (tasaInteresMensual * Math.pow(1 + tasaInteresMensual, numPagos)) / (Math.pow(1 + tasaInteresMensual, numPagos) - 1);
double totalAPagar = cuotaMensual * numPagos;
System.out.println("La cuota mensual a pagar es: $" + cuotaMensual);
System.out.println("El total a pagar es: $" + totalAPagar);


    }
}
