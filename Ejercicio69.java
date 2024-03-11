public class Ejercicio69 {
     public static void main(String[]args){
        int suma = 0;
        for (int i = 21; i >= 2; i-=2) {
            suma += i;
            //System.out.println(suma+"+="+i);
        }
        System.out.println("La suma de los números desde 21 hasta 2 es: " + suma);
    }
}
