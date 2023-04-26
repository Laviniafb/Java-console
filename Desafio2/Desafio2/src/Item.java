public class Item {
    private String nome;
    private Double preco_base;

    private int ano_fabricacao;


    public Item(String nome, Double preco_base, int ano_fabricacao) {
        this.nome = nome;
        this.preco_base = preco_base;
        this.ano_fabricacao = ano_fabricacao;
    }

    public double calcular_preco(){
        if(2023-this.ano_fabricacao > 10){
            this.preco_base = this.preco_base -( this.preco_base*0.01);
            return this.preco_base;
        }else{
            return this.preco_base;
        }
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco_base(Double preco_base) {
        this.preco_base = preco_base;
    }
    @Override
    public String toString() {
        return "item{" +
                "nome='" + this.nome + '\'' +
                ", preco_base=" + this.preco_base +
                '}';
    }


    public Double getPreco_base() {
        return this.preco_base;
    }
}