import java.util.*;
public class Ejercicio23 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
Random altr=new Random();
int d=0,e=0,f=0;
int a=(int)(Math.random()*9+1);
int b=(int)(Math.random()*9+1);
int c=(int)(Math.random()*9+1);

do{
    a=(int)(Math.random()*9+1);
    b=(int)(Math.random()*9+1);
    c=(int)(Math.random()*9+1);
    if(a!=b&& a!=c && b!=c){
        break;
    }
    }while(true);
//System.out.println(a+"-"+b+"-"+c);
for(int i=1;i<=4; i++){
    System.out.println("__________________________________________________________");
    System.out.println("\nNUMERO DE INTENTOS RESTANTES ["+(4-i)+"]");

    

    System.out.println("Ingresa el posible numero de la casilla N: [1]");
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


System.out.println("Ingresa el posible numero de la casilla N: [2]");
e=leer.nextInt();
if(e==b){
System.out.println("Verde");
}else if(e==a){
System.out.println("Amarillo");
}else if(e==c){
System.out.println("Amarillo");
}else{
System.out.println("Rojo");
}

System.out.println("Ingresa el posible numero de la casilla N: [3]");
f=leer.nextInt();
if(f==c){
System.out.println("Verde");
}else if(c==b){
System.out.println("Amarillo");
}else if(c==a){
System.out.println("Amarillo");
}else{
System.out.println("Rojo");
}
if(d==a && e==b && f==c){
  
    break;
}

}
if(d==a && e==b && f==c){
    System.out.println("\nRespuestas a["+a+"], b["+b+"], c["+c+"]");
    System.out.println("Ganaste");
}else{
System.out.println("Respuestas a["+a+"], b["+b+"], c["+c+"]");
System.out.println("Fallaste");
}
    }
}
