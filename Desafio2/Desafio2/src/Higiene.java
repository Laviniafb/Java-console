public class Higiene extends Item {
    private boolean perfumando;


    public Higiene(String nome, Double preco_base, int ano_fabricacao, boolean perfumando) {
        super(nome, preco_base, ano_fabricacao);
        this.perfumando = perfumando;
    }

    public double calcular_preco(){
        if(this.perfumando) {
            setPreco_base(getPreco_base() + getPreco_base()*0.1);
            return getPreco_base();
        }else{
            return getPreco_base();
        }
    }

    public boolean isPerfumando() {
        return perfumando;
    }

    public void setPerfumando(boolean perfumando) {
        this.perfumando = perfumando;
    }

    @Override
    public String toString() {
        return "higiene{" +
                "perfumando=" + perfumando +
                '}';
    }
}