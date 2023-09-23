package Revisao;

public class Conta {
    
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    private Double saldo;     
    
    private Double limite;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Conta(Integer numero) {

        this.numero = numero;
        this.saldo = 0D;
        this.limite = 0D;
    }

    public Conta(Integer numero, Double limite) {

        this.numero = numero;
        this.saldo = 0D;
        this.limite = 0D;
    }

    public void atualizarSaldo(Double valor){
        this.saldo += valor;
    }

    public void setEmprestimo(Double valor) {
    }
}
