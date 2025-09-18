public class Biblioteca {
    public static void main(String[] args) {
        Livro Dorian = new Livro("O retrato de Dorian Gray", "Oscar Wilde");
        Livro Ensaio = new Livro("Ensaio sobre a cegueira", "José Saramago");

        Leitor Lucas = new Leitor("Lucas");
        Leitor Maria = new Leitor("Maria");
        
        Lucas.pegarLivro(Dorian);
        Maria.pegarLivro(Ensaio);


    }
}
