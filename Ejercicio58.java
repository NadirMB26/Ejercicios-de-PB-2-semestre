import java.util.*;
public class Ejercicio58 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa las horas trabajadas");
        int horasTrabajadas = leer.nextInt();
        System.out.println("Ingresa el valor por hora");
        double valorPorHora = leer.nextInt();
        double salario = horasTrabajadas*valorPorHora;
        System.out.println("El salario total es: $" + salario);
    }
}
