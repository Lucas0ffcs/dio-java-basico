import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um texto e descubra se é um palíndromo:");
        String word = scan.nextLine();

        String wordel = "";

        for(int i = 0; i <= word.length(); i++){
            wordel += word.charAt(word.length()-i);

        }
        System.out.println(wordel);
    }
}
