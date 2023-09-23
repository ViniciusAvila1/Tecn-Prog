package Revisao;

public class MoroBankMovimentacao implements MovimentacaoBusiness{

    @Override
    public void depositar(Conta conta, Double valor) {

        conta.atualizarSaldo(valor);

    }

    @Override
    public void sacar(Conta conta, Double valor) {

        if(conta.getSaldo() < valor){
            System.out.println("saldo paupérrimo");
            return; 
        }

        conta.atualizarSaldo(-valor);
    }

}