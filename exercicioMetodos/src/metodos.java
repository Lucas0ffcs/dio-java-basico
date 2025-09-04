import java.util.Scanner;

public class metodos {
    public static void main(String[] args) {
        String sinal;
        float num1, num2;
        int hora;
        int opcao = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Selecione qual método deseja testar:");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Bom dia!");
        System.out.println("3 - Em breve...");
        opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o sinal da operação:");
                sinal = scan.nextLine();
                System.out.println("Digite o primeiro número:");
                num1 = scan.nextFloat();
                System.out.println("Digite o segundo número:");
                num2 = scan.nextFloat();
                System.out.println(calculadora(sinal, num1, num2));
                break;
            case 2:
                System.out.println("Digite o horário atual:");
                hora = scan.nextInt();
                System.out.println(bomDia(hora));
                break;
            default:
                opcao = 1;
        }



















    }

    public static float calculadora(String sinal, float num1, float num2) {
        float result = 0;

        switch (sinal){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;

    }
    public static String bomDia(int hora) {
        String saudacao = "";
        if ( 7 < hora && hora < 12){
            saudacao = "Bom dia!";
        }
        if ( 12 <= hora && hora <= 17){
            saudacao = "Boa tarde!";
        }
        if ( 17 < hora || hora < 7){
            saudacao = "Boa noite!";
        }
        return saudacao;
    }

}

