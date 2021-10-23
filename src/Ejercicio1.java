import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar Pimer Numero:");
        num1 = leer.nextInt();
        System.out.println("Ingresar Segundo Numero:");
        num2 = leer.nextInt();
        leer.close();
        System.out.println("Resultados a los numeros Ingresados");
        System.out.println("---------------*-------------------");
        System.out.println(num1 + "*" + num2+"="+ num1*num2);
        System.out.println(num1 + "+" + num2+"="+ num1+num2);
        System.out.println(num1 + "/" + num2+"="+ num1/num2);
        System.out.println(num1 + "-" + num2 +"="+(num1-num2));

    }

}
