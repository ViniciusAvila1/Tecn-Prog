package Revisao;

public interface MovimentacaoBusiness {
    
    public void depositar(Conta conta, Double valor);
    public void sacar(Conta conta, Double valor); 

}
