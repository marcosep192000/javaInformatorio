package Ejercicios1;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese primer numero:");
        int n1 = leer.nextInt();
        System.out.println("ingrese segundo numero:");
        int n2 = leer.nextInt();
        leer.close();
        int  contador = 0 ;
        for (int i =  0; i < n2 ; i++){
             contador = contador + (n1);
        }
        System.out.println( n1+" x "+n2+" = " + contador + "" );
    }
}
