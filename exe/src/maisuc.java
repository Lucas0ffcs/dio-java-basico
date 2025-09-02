import java.util.Scanner;



public class maisuc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texto;

        int cont = 0;

        System.out.println("Digite uma frase: ");
        texto = scan.nextLine();

        for(int i = 0; i <= texto.length(); i++){
            if(texto.charAt(i) == 'a'){

                cont++;


            }
        }
        System.out.println("Seu texto possui " + cont + "letras \"A\"");

    }
}
