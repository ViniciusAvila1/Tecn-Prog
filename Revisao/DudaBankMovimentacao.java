package Revisao;

public class DudaBankMovimentacao 
    extends MovimentacaoPadrao
    implements Emprestimo {


    private static final Integer MULTIPLO_EMPRESTIMO = 3;
    @Override
    public void emprestimo(Conta conta, Double valor) {
        
        final Double limiteEmprestimo = conta.getSaldo() * MULTIPLO_EMPRESTIMO;

        if(valor > limiteEmprestimo){
            System.out.println("Valor maior que o limite");
        }
        else{
            conta.setEmprestimo(valor);
        }
    }


}

