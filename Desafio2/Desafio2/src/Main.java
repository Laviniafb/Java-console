public class Main {
    public static void main(String[] args) {
        Carrinho carrinho1 = new Carrinho(123456789L);

        Usuario cliente1 = new Usuario(123456789L, "André", true);
        Usuario_Especial presidente = new Usuario_Especial(678312890L, "Jair Bolsonaro", false, true);

        if (presidente.aplicarDesconto(carrinho1))
            System.out.println("Desconto realizado com sucesso");

        System.out.println(cliente1);
        System.out.println(presidente);
        System.out.println();

        Item obitem = new Item("banana", 2.0, 2000);
//        System.out.println(obitem);
//        System.out.println(obitem.getNome());
//        System.out.println(obitem.calcular_preco());
//        obitem.setNome("banan2");
//        obitem.setPreco_base(3.0);
//        System.out.println(obitem.getNome());
//        System.out.println(obitem.calcular_preco());

        Data validade2 = new Data(28,3,2025);
//
//        alimentos obalimento = new alimentos("maça", 3.0, 2000, 500, 2000, validade2);
//        System.out.println(obalimento);
//        System.out.println(obalimento.getKcal());
//        System.out.println(obalimento.getPeso());
//        System.out.println(obalimento.getValidade());
//        System.out.println(obalimento.calcular_preco());

        Higiene obigiene = new Higiene("sabão", 2.0,2000, true);
        carrinho1.adicionarItem(obigiene);


        System.out.println(carrinho1.getItens());
        System.out.println(carrinho1.calcularTotal());
        

//
//        System.out.println(obigiene);
//        System.out.println(obigiene.isPerfumando());
//        System.out.println(obigiene.calcular_preco());
//        obigiene.setPerfumando(false);
//        System.out.println(obigiene);
    }
}