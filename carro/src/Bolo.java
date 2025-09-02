public class Bolo {
    String sabor = "Baunilha";
    String recheio = "Creme";
    int camadas = 1;
    int morangos = 4;

    public void mudarSabor(String saborNovo){
        sabor = saborNovo;
    }
    public void mudarRecheio(String novoRecheio){
        recheio = novoRecheio;
    }
    public void mudarCamadas(int novaCamadas){
        camadas = novaCamadas;
    }
    public void mudarMorangos(int novoMorangos){
        morangos = novoMorangos;
    }
}
