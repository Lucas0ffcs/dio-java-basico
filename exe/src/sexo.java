import java.util.Scanner;

public class sexo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;


        System.out.println("Digite um texto qualquer:");
        String palavra = scan.nextLine();

        for(int x = 0; x < palavra.length(); x++){

            if (Character.toUpperCase(palavra.charAt(x)) == 'A' ||
                Character.toUpperCase(palavra.charAt(x)) == 'E' ||
                Character.toUpperCase(palavra.charAt(x)) == 'I' ||
                Character.toUpperCase(palavra.charAt(x)) == 'O' ||
                Character.toUpperCase(palavra.charAt(x)) == 'U'){

                soma++;

            }
        }


        System.out.println("Seu texto possui " + soma + " vogais.");
    }
}
