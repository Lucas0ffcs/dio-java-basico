public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 0;


    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para:" + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para:" + volume);
    }
    public void aumentarCanal(){
        if (ligada == false){
            canal = 0;
            System.out.println("A TV não está ligada.");
        }
        canal++;

    }
    public void diminuirCanal(){
        if (!ligada){
            canal = 0;
            System.out.println("A TV não está ligada.");
        }
        canal--;
    }
    public void mudarCanal(int novoCanal){
        if (!ligada){
            canal = 0;
            System.out.println("A TV não está ligada.");
        }
        canal = novoCanal;
    }

}
