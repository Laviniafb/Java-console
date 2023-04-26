import java.util.ArrayList;
import java.util.Arrays;

public class Carrinho {
    private long owner;
    private ArrayList<Item> itens;
    private double total;

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens( ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Carrinho(long owner) {
        this.owner = owner;
        this.itens = new ArrayList<Item>();
        this.total = 0;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < this.itens.size(); i++) {
            total += itens.get(i).calcular_preco();
        }
        this.total = total;
        return this.total;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "owner='" + this.owner + '\'' +
                ", itens=" + this.itens +
                ", total=" + this.total +
                '}';
    }
}
