import java.util.*;
public class Ejercicio33 {
    public static void main(String[]args){
Scanner leer=new Scanner(System.in);
int cantidad,salario,sac=0,M=0,F=0,genero,mas=0;

System.out.println("Ingresa tu cantidad de empleados");
cantidad=leer.nextInt();
double salarioMax = Double.MIN_VALUE;
double salarioMin = Double.MAX_VALUE;
for(int i=1; i<=cantidad;i++){
    System.out.println("Ingresa el genero [1] Femenino o [2]Masculino");
    genero=leer.nextInt();
    System.out.println("Ingresa el salario");
    salario=leer.nextInt();
    switch (genero) {
        case 1:
        F++;
            break;
            case 2:
            M++;
            break;
    }

    if (salario > salarioMax) {
        salarioMax = salario;
    }

    if (salario < salarioMin) {
        salarioMin = salario;
    }
    if(salario>700){
        mas++;
    }
   
}
int pf=(F*100)/cantidad;
int pm=(M*100)/cantidad;
System.out.println("El porcentaje de mujeres es de el: "+(pf)+"%");
System.out.println("El porcentaje de hombres es de el: "+(pm)+"%");
System.out.println("La cantidad de personas que ganan mas de 700 es: "+mas );
System.out.println("El promedio de salarios es: "+(salarioMax+salarioMin)/2);
    }
}
