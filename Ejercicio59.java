import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b;
System.out.println("Ingresa un numero");
a=leer.nextInt();
while (a<0||a>10) {
    System.out.println("Tu valor ingresado no esta disponible introduce un numero del 1-10");
    a=leer.nextInt();
}
for(int i=0;i<=10;i++){
    b=a*i;
    System.out.println(a+" x "+i+" = "+ b);
}
    }
}
