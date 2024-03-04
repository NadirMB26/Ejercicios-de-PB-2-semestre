public class Ejercicio44 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            double potencia = Math.pow(Math.PI, i);
            double rC = Math.sqrt(potencia);
            System.out.println("PI^"+i+" = "+potencia+" Raíz cuadrada:"+rC);
        }
    }
}
