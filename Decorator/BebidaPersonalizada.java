import java.util.List;

import Decorator.BlendDecorator;

public class BebidaPersonalizada extends BlendDecorator {
    
    private List<Bebida> listaBebidas;

    public BebidaPersonalizada(List<Bebida> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    @Override
    public String getDescricao() {
        String texto = "Bebida personalizada: \n";

        for(Bebida b : listaBebidas) {
            texto += b.getDescricao() + ", ";
        }
        return texto;
    }    

    @Override
    public Double getValor() {
        Double valorBase = 10D;

        for(Bebida b : this.listaBebidas) {
            valorBase += b.getValor();
        }

        return valorBase;
    }

    
}
