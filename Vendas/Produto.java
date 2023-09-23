package Vendas;
public class Produto {

    private int codigo;
    private String tipo;
    private String descricao;
    private int quantidade;
    private Double precodecusto;
    private Double precoVenda;
    private String estado;

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Double getPrecodecusto() {
        return precodecusto;
    }
    public void setPrecodecusto(Double precodecusto) {
        this.precodecusto = precodecusto;
    }
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", precoVenda=" + precoVenda
                + ", precodecusto=" + precodecusto + ", quantidade=" + quantidade + ", tipo=" + tipo + "]";
    }
}