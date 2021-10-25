package Ejercicios2;

import javax.swing.plaf.PanelUI;
import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class Ejercicio1 {
   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);


       List<String> lista = new ArrayList<>();
       lista.add("#1 - Cordoba");
       lista.add("#2 - Neuquen");
       lista.add("#3 - Las Breñas");
      /* int contador = 1;
       for (int i = 1 ; i< 4 ; i++) {

           System.out.println("Ingresa el Nombre que mas te gusta para el puesto  N° :" + i);
           String ciudad = sc.nextLine();
           lista.add(ciudad);
           contador ++ ;
       }*/
       System.out.println( "mis ciudades favoritas son : "+ lista );
          }


}
