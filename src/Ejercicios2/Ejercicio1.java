package Ejercicios2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
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
       for (String c : lista) {
           System.out.println(c);
       }
   }
}
