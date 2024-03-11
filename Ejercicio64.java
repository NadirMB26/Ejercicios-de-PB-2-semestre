import java.util.*;
public class Ejercicio64 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int a,b=0,c;
System.out.println("Digita tu numero");
a=leer.nextInt();
while (a<0) {
a=leer.nextInt(); 
}
System.out.println("Digita tu potencia");
b=leer.nextInt();
while (b<0) {
    b=leer.nextInt(); 
    }
    potencias(a, b);
    }
    public static void potencias(int entero,int potencia){
        int resultado=entero;
        for(int i=1; i<potencia;i++){
             resultado+=resultado*entero;
        }
        System.out.println("Tu numero["+entero+"] elevado a ["+potencia+"] da como resultado: "+resultado);
    }
}
