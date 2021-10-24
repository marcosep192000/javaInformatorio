package Ejercicios1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args)
    {
        String nomApe,direccion,ciudad;
        Integer numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("               Ingresá Nombre y Apellido                 ");
        System.out.println("------------------------********------------------------ ");
        nomApe = scanner.nextLine();
        System.out.println("                    Ingresá direccion                    ");
        System.out.println("------------------------********------------------------ ");
        direccion= scanner.nextLine();
        System.out.println("                    Ingresá tu Ciudad                    ");
        System.out.println("------------------------********------------------------ ");
        ciudad= scanner.nextLine();
            System.out.println("         Ingresá tu  NUMERO de vivivienda            ");
        System.out.println("------------------------********------------------------ ");
        numero= scanner.nextInt();
        scanner.close();

        List list = new ArrayList();

        list.add(nomApe);
        list.add(direccion);
        list.add(ciudad);
        list.add(numero);

        System.out.println(" :::::::::::::::::INFORMACION:::::::::::::::    ");

        System.out.println( list.toString().replace("[", "").replace("]", "").replace(",", " -"));





    }
}
