import java.util.*;
public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Digita tu numero para la serie fibonacci");
        int n = leer.nextInt();
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci hasta " + n + " términos: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
