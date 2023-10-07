package Listas;

import java.util.ArrayList;
import java.util.List;

public class Colecoes {
    
    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<Integer>();



        for(int i = 0; i < 20; i++) {
            listaNumeros.add((int)(Math.random() * 999));
        }

        listaNumeros.add(4, 900);
        // mostrando a lista
        

        // por posição
        for(int i = 0; i < listaNumeros.size(); i++) {
            System.out.printf("%d ", listaNumeros.get(i));
        }

        Integer somaMultiplos = 0;

        // for enhanced
        for(Integer n : listaNumeros) {
            if(n % 5 ==0) {
                somaMultiplos += n;
            }
        }

        // stream
        listaNumeros.forEach((n -> {
            System.out.println(n);
        }));

        // parallel
        listaNumeros.stream().parallel().forEach(n -> {
            System.out.println(Thread.currentThread().getName() + " " + n); // pegar a thread atual, que está executando o processo
        });
    }
}
