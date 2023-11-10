public abstract class Pizza {
    
    protected String nome;

    // composição = "tem um"
    protected Borda borda;
    
    public Borda getBorda() {
        return borda;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Double valor;
}
