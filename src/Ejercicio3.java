import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int numero ;
        numero  = leer.nextInt();
        int fact = 1 ;
        for (int i = 1 ;i <= numero ;i++) {
         fact = fact *i;
        }
        System.out.println(fact);

    }

}
