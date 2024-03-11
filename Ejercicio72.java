import java.util.*;
public class Ejercicio72 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
double horas,tarifa;
System.out.println("Digita las horas trabajadas");
horas=leer.nextInt();
System.out.println("Digita la tarifa por hora");
tarifa=leer.nextInt();
if(horas>40){
double horasextra=horas-40;
double pago=40*tarifa;
double pagohorasextra=(horasextra*tarifa)*0.50;
System.out.println("Tu pago por las horas trabajadas es:"+pago);
System.out.println("Tu pago de "+horasextra+" horas extra es: "+pagohorasextra);
System.out.println("Tu total de pago es "+(pago+pagohorasextra));
}else{
    double pago=horas*tarifa;
    System.out.println("Tu pago por las horas "+horas+"trabajadas es:"+pago);  
}
    }
}
