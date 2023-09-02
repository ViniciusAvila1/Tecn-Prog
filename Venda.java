public class Venda extends Produto {
    
    public Produto vender(Produto produto) {

        Double precoVenda;

        if(produto.getQuantidade() <= 5) {
            precoVenda = produto.getPrecodecusto() * 1.35;
        } else {
            precoVenda = produto.getPrecodecusto() * 1.25;
        }

        produto.setPrecoVenda(precoVenda);

        return produto;
    }
}
