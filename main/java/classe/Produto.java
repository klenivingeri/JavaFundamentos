package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial
    }

    Produto() {} // esse aqui é o contrutor padrão
    float precoComDesconto() {
        return (float) (preco * (1 - desconto));
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
