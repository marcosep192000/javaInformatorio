package Ejercicios1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String palabra;
        char caracter; ;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresá una palabra para convertir a MAYUSCULAS: ");
        System.out.println("-----------------********----------------------- ");
        palabra = reader.nextLine();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            caracter = palabra.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                caracter= (char)(caracter - (int) 'a' + (int) 'A');
                st.append(caracter);
            }
        }
        System.out.println(st);
        }
}