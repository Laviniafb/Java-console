public class Usuario {
    private long cpf;
    private String nome;
    private boolean frequencia;

    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(boolean frequencia) {
        this.frequencia = frequencia;
    }

    public Usuario(long cpf, String nome, boolean frequencia) {
        this.cpf = cpf;
        this.nome = nome;
        this.frequencia = frequencia;
    }

    public Usuario(long cpf, boolean frequencia) {
        this.cpf = cpf;
        this.frequencia = frequencia;
    }

    private boolean aplicarDesconto(Carrinho carrinhoUser){
        if (this.frequencia)
        {
            carrinhoUser.setTotal(carrinhoUser.getTotal() * 0.9);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "O cliente " + this.nome + " de cpf " + this.cpf + " tem frequência como: " + this.frequencia;
    }
}
