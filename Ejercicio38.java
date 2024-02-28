import java.util.*;
public class Ejercicio38 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int edad,manzanas;
System.out.println("Digita tu edad");
edad=leer.nextInt();
manzanas=(edad*8)/4;
System.out.println("Las manzanas que ha consumido en sus "+edad+" años de vida son "+manzanas+ " y los kilogramos de fruta consumidos son "+(edad*8));
    }
}
