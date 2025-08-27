import java.util.Scanner;

public class contrario {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();


        for (int i = palavra.length(); i > 0; i--) {
            System.out.print(palavra.charAt(i));
        }
    }
}
