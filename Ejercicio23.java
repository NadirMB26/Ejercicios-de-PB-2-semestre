import java.util.*;
public class Ejercicio23 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
Random altr=new Random();
int d,e,f;
int a=(int)(Math.random()*9+1);
int b=(int)(Math.random()*9+1);
int c=(int)(Math.random()*9+1);
//System.out.println(a+b+c);
for(int i=1;i<=4; i++){
    System.out.println("Ingresa el posible numero de la casilla N: ["+i+"]");
    d=leer.nextInt();
if(d==a){
System.out.println("Verde");
}else if(d==b){
    System.out.println("Amarillo");
}else if(d==c){
    System.out.println("Amarillo");
}else{
    System.out.println("Rojo");
}
}
    }
}
