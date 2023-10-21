package Decorator;

public class Expresso extends Bebida {
    
    public Expresso() {
        super.descricao = "expresso cremosinho";
    }

    @Override
    public Double getValor() {
        return 5.0;
    }
}
