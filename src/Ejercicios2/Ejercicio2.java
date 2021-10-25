package Ejercicios2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args){
        List <Integer> lista = new ArrayList<>();
        agregar(lista);
        System.out.println("lista ANTES de añadir numeros a la lista : "+lista.size());
        lista.add(0,00);
        lista.add(6,60);
        for(Integer l :lista){
            System.out.println(l);
        }
        System.out.println("lista DESPUES  de añadir numeros a la lista : "+lista.size());
    }

    public static void agregar( List<Integer> lista){
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
    }

}
