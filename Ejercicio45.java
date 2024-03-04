import java.util.*;
public class Ejercicio45 {
    public static void main(String[]args){
      
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingresa un numero Real");
            int a=leer.nextInt();
            if (a < 0) {
              
                System.out.println("El signo del número " + a + " es: " +-1);
            } else if (a > 0) {
                System.out.println("El signo del número " + a + " es: " + 1);
               
            } else {
                System.out.println("El signo del número " + a + " es: " + 0);
               
            }
            
            } 
    }

