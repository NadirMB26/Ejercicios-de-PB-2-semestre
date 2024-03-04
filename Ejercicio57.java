import java.util.*;
public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa tu numero");
        int numero = leer.nextInt();
        int a=numero;
        int suma = 0;
        while (numero != 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }
        System.out.println("La suma de los dígitos de " +a+ " es " + suma + ". ");
    }

}
