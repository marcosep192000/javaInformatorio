package Ejercicios1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
          String frase ;
          char caracter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************Ingresa una frace******************************");
        frase = scanner.nextLine();
        System.out.println(":::::::::::::::::Ingresa un caracter que quieras contar:::::::::::::::::: " );
        caracter =     scanner.next().charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++)
        {
           char caract= frase.charAt(i);
            if ( caracter == caract)
            {
                contador ++ ;
            }

        }

        System.out.println("cantidad de veces que aparece la letra (" +caracter+") : " +contador);
    }

}
