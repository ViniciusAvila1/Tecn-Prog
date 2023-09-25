package CarDealership;

public class Main {
    public static void main(String... args) {

        Carro c = new Carro();
        c.marca = "fiat";
        c.modelo = "uno - trovao azul";

        System.out.println(c.marca);

        Carro c2 = new Carro();
        c2.marca = "volks";

        System.out.println(c.marca);

        c2 = c;

        System.out.println(c.marca);
        
    }
}
