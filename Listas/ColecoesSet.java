package Listas;

import java.util.HashSet;
import java.util.Set;

public class ColecoesSet {
    
    public static void main(String... strings) {

        Set<Integer> setNumeros = new HashSet<Integer>();

        while(setNumeros.size() < 50) {
            System.out.println(setNumeros.add((int) (Math.random() * 100)));
            
        }

        java.util.Iterator<Integer> it = setNumeros.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("##### set de cliente");
        Set<Cliente> setClientes = new HashSet<>();

        Cliente c1 = new Cliente(1, "joão");
        Cliente c2 = new Cliente(2, "maria");
        Cliente c3 = new Cliente(3, "joão");
        Cliente c4 = new Cliente(4, "pedro");

        System.out.println(setClientes.add(c1));
        System.out.println(setClientes.add(c2));
        System.out.println(setClientes.add(c3));
        System.out.println(setClientes.add(c4));

        setClientes.forEach(cliente -> {
            System.out.println(cliente);
        });
    }
}
