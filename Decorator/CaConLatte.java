package Decorator;

public class CaConLatte extends BlendDecorator {
    
    private Bebida bebida;

    public CaConLatte(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + " + chocolate da vovó";
    }

    @Override
    public Double getValor() {
        return 6.00 + this.bebida.getValor();
    }
    
}

