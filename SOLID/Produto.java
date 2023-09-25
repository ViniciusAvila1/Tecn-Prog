package SOLID;
public class Produto {

    private int quantidade;
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public Double getPrecoCusto() {
        return precoCusto;
    }
    public Double getPrecoVenda() {
        return precoVenda;
    }
    private String descricao;
    private Double precoCusto;
    private Double precoVenda;
}