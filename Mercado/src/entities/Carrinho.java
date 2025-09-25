package entities;

import java.util.ArrayList;

public class Carrinho {
    String nome;
    public ArrayList<Produto> carrinho = new ArrayList<Produto>();



    public Carrinho(String nome){
        this.nome = nome;

    }
    public void addProduto(Produto produto, int quantidade) {
        if (produto.estoque < quantidade || quantidade <= 0) {
            System.out.println("Não temos esta quantidade deste produto em nosso estoque.");
        }else{
            produto.vender(quantidade);
            for(int i = 0; i <= quantidade; i++) {
                carrinho.add(produto);

            }
            System.out.println(quantidade + " unidades de "+ produto.nome + " adicionadas a "+ nome);
        }
    }
    public void rmvProduto(Produto produto, int quantidade){
        Produto itemArmv = produto;
        int contador = 0;

        for(Produto conte : carrinho){
            if(conte.equals(itemArmv)){
                contador++;
            }
        }
        if(quantidade > contador || quantidade <= 0){
            System.out.println("Digite uma quantidade válida!");
        }else {
            for (int i = 0; i <= quantidade; i++) {
                carrinho.remove(produto);

            }
            produto.repor(quantidade);
        }

    }
    public void exibirCarrinho(){
        for(Produto item:carrinho){
            for(int i = carrinho.size(); i == 0; i--) {
                int cont = 0;
                cont++
                if (item == carrinho.){
                    //ESSE METODO ESTÁ UMA BAGUNÇA, PRECISO CONSERTAR DEPOIS
                    
                }
            }
        }

    }


}
