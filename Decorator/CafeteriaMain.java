package Decorator;

import java.util.ArrayList;
import java.util.List;

public class CafeteriaMain {

    public static void main(String[] args) {

        Bebida expresso = new Expresso();

        System.out.println(expresso.getDescricao() + expresso.getValor());
        
        Bebida conCafe = new ConCafe(expresso);
        System.out.println(conCafe.getDescricao() + conCafe.getValor());

        Bebida caconLatte = new CaConLatte(conCafe);
        System.out.println(caconLatte.getDescricao() + caconLatte.getValor());

        List<Bebida> listaBebidas = new ArrayList<Bebida>();
        listaBebidas.add(expresso);
        listaBebidas.add(conCafe);
        listaBebidas.add(caconLatte);

        Bebida bebidaPersonalizada = new BebidaPersonalizada(listaBebidas);

        System.out.println(bebidaPersonalizada.getDescricao() + bebidaPersonalizada.getValor());
    }
}