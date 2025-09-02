import java.util.Scanner;

public class diasemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int dia = scan.nextInt();
        String diaDaSemana = "";



        int result = 0;








        switch (result){
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
        }


        System.out.println("O dia da semana correspondente ao seu número é: \n" + diaDaSemana);
    }
}
