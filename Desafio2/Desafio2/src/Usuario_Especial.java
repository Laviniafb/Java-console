public class Usuario_Especial extends Usuario {
    private boolean fidelidade;

    public boolean getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(boolean fidelidade) {
        this.fidelidade = fidelidade;
    }
    public Usuario_Especial(Long cpf, String nome, boolean frequencia, boolean fidelidade) {
        super(cpf, nome, frequencia);
        this.fidelidade = fidelidade;
    }

    public Usuario_Especial(Long cpf, boolean frequencia, boolean fidelidade) {
        super(cpf, frequencia);
        this.fidelidade = fidelidade;
    }

    public boolean aplicarDesconto(Carrinho carrinhoUser){
        if (this.fidelidade) {
            carrinhoUser.setTotal(carrinhoUser.getTotal() * 0.5);
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "O cliente " + getNome() + " de cpf " + getCpf() + " tem frequência como: " + getFrequencia()
                + "\nTem fidelidade como: " + this.fidelidade;
    }
}
