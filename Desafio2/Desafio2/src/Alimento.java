public class Alimento extends Item {
    private int peso;
    private int kcal;

    private Data validade;

    public Alimento(String nome, Double preco_base, int ano_fabricacao, int peso, int kcal, Data validade) {
        super(nome, preco_base, ano_fabricacao);
        this.peso = peso;
        this.kcal = kcal;
        this.validade = validade;
    }



    public double calcular_preco(){
        if(validade.getAno()-2023 < 5) {
            setPreco_base(getPreco_base() - getPreco_base()*0.05);
            return getPreco_base();
        }else{
            return getPreco_base();
        }
    }

    public Data getValidade() {
        return validade;
    }


    @Override
    public String toString() {
        return "alimentos{" +
                "peso=" + peso +
                ", kcal=" + kcal +
                ", validade=" + validade +
                '}';
    }

    public int getPeso() {
        return peso;
    }

    public int getKcal() {
        return kcal;
    }
}