import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        String sabor;
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo a confeitaria do Luquinhas");
        System.out.println("Qual sabor de bolo deseja?");
        sabor = scan.nextLine();
        System.out.println("Qual será o recheio?");
        String recheio = scan.nextLine();
        System.out.println("Quantas camadas quer de recheio? ");
        int camadas = scan.nextInt();
        System.out.println("Quantos morangos deseja?");
        int morangos = scan.nextInt();
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.mudarSabor(sabor);
        boloDeChocolate.mudarRecheio(recheio);
        boloDeChocolate.mudarCamadas(camadas);
        boloDeChocolate.mudarMorangos(morangos);

        System.out.println("O sabor do bolo é: " + boloDeChocolate.sabor);
        System.out.println("O recheio do bolo é de: " + boloDeChocolate.recheio);
        System.out.println("O bolo terá " + boloDeChocolate.camadas + " camadas");
        System.out.println("O bolo terá " + boloDeChocolate.morangos + " morangos");


    }
}
