package Revisao;

public class BancoApp {
    
    public void main(String...strings) {

        MovimentacaoBusiness movimentacao = new MoroBankMovimentacao();
        Conta vinicius = new Conta(101022);
        System.out.println(vinicius);

        movimentacao.depositar(vinicius, 250.00);
        System.out.println(vinicius);

        movimentacao.sacar(vinicius, 50.00);
        System.out.println(vinicius);

        movimentacao.sacar(vinicius, 500.00);
        System.out.println(vinicius);
    }
}
