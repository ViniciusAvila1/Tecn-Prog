public class PizzaFactory {
    
    public static Pizza createPizza(PizzaEnum pizzaEnum) {

        Pizza p = null;

        if(PizzaEnum.CALABRESA.equals(pizzaEnum)) {
            p = new PizzaCalabresa();

            Borda b = new Borda();
            b.setTipoBorda("Cheedar");
            b.setValor(5.00);

            p.setBorda(b);

        } else if (PizzaEnum.RUCULA.equals(pizzaEnum)){
            p = new PizzaRucula();
        } else if (PizzaEnum.MARGUERITA.equals(pizzaEnum)){
            p = new PizzaMarguerita();
        } else if (PizzaEnum.QUATRO_QUEIJOS.equals(pizzaEnum)){
            p = new PizzaQuatroQueijos();
        }

        return p;
    }
}
