public class Main {

    public static void main(String... args) {

        Produto p1 = new Produto();
        p1.setCodigo(123);
        p1.setDescricao("Celular bonito");
        p1.setTipo("A");
        p1.setQuantidade(2);
        p1.setPrecodecusto(3500d);
        p1.setEstado("RJ");

        Venda venda;
        
        if("MG".equalsIgnoreCase(p1.getEstado())) {
            venda = new VendaMG();
        } else {
            venda = new Venda();
        }

        System.out.println(venda.vender(p1));
    }
}
