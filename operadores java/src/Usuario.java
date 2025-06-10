public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.desligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.mudarCanal(13);
        System.out.println("TV ligada? :" + tv.ligada);
        System.out.println("Canal atual? :" + tv.canal);
        System.out.println("Volume atual? :" + tv.volume);
    }
}