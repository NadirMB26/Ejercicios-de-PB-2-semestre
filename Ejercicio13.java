import java.util.*;
public class Ejercicio13 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a;
for(int i=1; i<=3; i++){
    System.out.println("Digita tu numero ["+i+"]");
    a=leer.nextInt();
    System.out.println("Tu ultimo digito es: "+a%10);
    }
}
}
