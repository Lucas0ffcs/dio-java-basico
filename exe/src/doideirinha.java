import java.util.Scanner;

public class doideirinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String texto = scan.nextLine();
        for (int i = 1; i <= texto.length(); i++){

            System.out.println(i);
        }


    }
}
