package aplication;
import entities.Produto;
import entities.Carrinho;


public class Main {
    public static void main(String[] args) {

        Produto feijao = new Produto("Feijão", 8,10);
        Produto camisinha = new Produto("Jontex", 18.5, 10);

        Carrinho cesta1 = new Carrinho("cesta1");
        Carrinho cesta2 = new Carrinho("cesta2");


        cesta1.addProduto(feijao, 2);
        cesta1.addProduto(camisinha, 6);
        cesta1.exibirCarrinho();
        System.out.println("é: " +cesta1.carrinho.size());

    }
}
