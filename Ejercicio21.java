public class Ejercicio21 {
    public static void main(String[] args){
        int A=5,B=10,C ;
        System.out.println("Antes A = " + A + ", B = " + B);
        C = A;
        A = B;
        B = C;
        System.out.println("Después A = " + A + ", B = " + B);

    }
}
