import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese primer numero:");
        int n1 = leer.nextInt();
        System.out.println("ingrese segundo numero:");
        int n2 = leer.nextInt();
        leer.close();


        int contador= 0;

        while (n1 != n2 ) {
          contador = contador * n2;
        }
        System.out.println(contador);
    }
}

