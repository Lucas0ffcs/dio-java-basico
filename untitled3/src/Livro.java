public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado = false;

    public Livro(String titulo, String autor){ //CONSTRUTOR
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar(){
        if(!emprestado){
            emprestado = true;
            System.out.println("Livro "+titulo+ " do autor "+ autor+" emprestado com sucesso!");
        }else{
            System.out.println("O livro "+titulo+ " do autor "+ autor+" não está disponível.");
        }

    }
    public void devolver(){
        if(emprestado){
            System.out.println("Livro devolvido com sucesso!");
        }else{
            System.out.println("Este livro já foi devolvido.");
        }
    }
}
