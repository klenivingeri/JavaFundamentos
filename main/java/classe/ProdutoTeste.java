package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "NoteBoook";
        p1.preco =  13112.23;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Bic";
        p2.preco = 12.12;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double precoFinal2Gerent = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("Média do Carrinho: " + mediaCarrinho);
        System.out.println("Desconto: R$%.2f. " + precoFinal2);
        System.out.println("Desconto: R$%.2f. " + precoFinal2Gerent);
    }
}
