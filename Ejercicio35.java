import java.util.*;
public class Ejercicio35{
 public static void main(String[]args){
Scanner leer=new Scanner(System.in);
System.out.println("Ingrese las horas trabajadas por el maestro");
int a=leer.nextInt();
System.out.println("Ingresa la tarifa");
int tarif=leer.nextInt();
if(a>40){
   int b= 40*tarif;
   int c=(a-40)*tarif;
   double d=c*0.5;
   System.out.println("Su pago por las ["+a+"] Horas fue de:"+(d+b));
}else{
    int b=a*tarif;
    System.out.println("Su pago fue de:"+b);
}

}
    
}
