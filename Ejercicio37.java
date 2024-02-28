import java.util.*;
public class Ejercicio37 {  
      public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    double horas,minutos;
    System.out.println("Ingresa las horas");
    horas=leer.nextDouble();
    do{
    System.out.println("Ingresa los minutos (este valor no puede ser mayor a 60)");
    minutos=leer.nextDouble();
    }while(minutos>60);
    if(minutos<=10){
        System.out.println("Su total a pagar en el estacionamiento por las "+horas+" horas y "+minutos+" minutos es de "+horas*15.00);
    }else{
        minutos=1;
    //System.out.println("El costo por "+horas+" horas es de "+(horas*15.00)+", y minutos "+(minutos*0.25)+" para un total de "+((horas*15.00)+(minutos*0.25)));
    System.out.println("El costo por horas en el estacionamiento es de "+(horas*15.00)+", y minutos "+(minutos*15.00)+" para un total de "+((horas*15.00)+(minutos*15.00)));
    }
    }
}
