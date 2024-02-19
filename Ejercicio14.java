import java.util.*;
public class Ejercicio14 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a=0;
System.out.println("Digita tu numero de 4 cifras");
a=leer.nextInt();
if(a>9999){
    System.out.println("El numero ingresado sobrepasa los limites");
}else{
    int suma = a / 1000 + (a % 1000) / 100 + (a % 100) / 10 + a % 10;
    System.out.println("La suma es "+suma);
}

    }
}
