import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();
        leer.close();
        System.out.println("________________________________________________________________________________");
        List<Integer>list = new ArrayList();
        for (int i=1; i <= numero;i++){
            list.add(i);
            System.out.println( list.toString().replace("[", "").replace("]", "").replace(",", ""));
        }
    }
}
