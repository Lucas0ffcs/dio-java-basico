public class Leitor {
    String nome;
    public Leitor(String nome){
        this.nome = nome;
    }
    public void pegarLivro(Livro livro){
        System.out.println(nome + " está tentando pegar o livro: " + livro.getTitulo());
        livro.emprestar();

    }
    public void devolverLivro(Livro livro){
        System.out.println(nome + " está tentando devolver o livro: " + livro.getTitulo());
        livro.devolver();

    }
    public void mostrarLivros(){

    }
}
