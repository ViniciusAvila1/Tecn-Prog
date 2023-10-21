package Decorator;

public class ConCafe extends BlendDecorator {
    
    protected Bebida bebida;

    public ConCafe(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {

        return "ConCafé + " + this.bebida.getDescricao();
    }

    @Override
    public Double getValor() {
        // TODO Auto-generated method stub
        return 10D + this.bebida.getValor();
    }

}
