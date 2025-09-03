

import java.util.Scanner;


public class fatorial {
    public static void main(String[] args) {
        int num;



        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número e veja seu fatorial:");
        num = scan.nextInt();

        int result = num;

        String text = Integer.toString(num);


        for(int i = num - 1; i > 0 ; i--){

            text += " x "+ i;
            result *= i;

            System.out.println(text + " = " + result);
        }

    }

}