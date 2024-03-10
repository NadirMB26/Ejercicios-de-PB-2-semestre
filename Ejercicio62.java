import java.util.*;
public class Ejercicio62 {
public static void main(String[]args){
Scanner leer=new Scanner(System.in);
double[]a=new double[6];
double b=0;
for(int i=0; i<6;i++){
System.out.println("Digita la ["+(i+1)+"] toma de temperatura");
a[i]=leer.nextDouble();
b+=a[i];
}

double temperaturaMaxima = Double.MIN_VALUE;
double temperaturaMinima = Double.MAX_VALUE;
System.out.println("La temperatura mas alta del dia fue"+ temperaturaMaxima);
System.out.println("La temperatura media del dia fue"+(b/6));
System.out.println("La temperatura mas baja del dia fue"+temperaturaMinima);

    }
}
