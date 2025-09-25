package entities;

public class Produto {
    String nome;
    double preco;
    int estoque;


    public Produto(String nome,double preço, int estoque){
        this.nome = nome;
        this.preco = preço;
        this.estoque = estoque;
    }
    public void vender(int quantidade){
        if (this.estoque >= quantidade) {
            this.estoque -= quantidade;
        }
    }
    public void repor(int quantidade){
        estoque += quantidade;
    }
    public void status(){
        System.out.println("Rótulo: "+ nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Estoque: "+ estoque);

    }

    @Override
    public String toString() {
        return nome;
    }
}
