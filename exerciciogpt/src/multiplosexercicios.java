import java.sql.SQLOutput;
import java.util.Scanner;

public class multiplosexercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        String nword;
        int contvg = 0;
        int contcon = 0;

        System.out.println("Digite uma palavra:");
        word = scan.nextLine();
        nword = word.toLowerCase();

        for (int i = 0; i < nword.length(); i++){
            if(     nword.charAt(i) == 'a' ||
                    nword.charAt(i) == 'e' ||
                    nword.charAt(i) == 'i' ||
                    nword.charAt(i) == 'o' ||
                    nword.charAt(i) == 'u'){
                contvg++;


            }else{
                contcon++;
            }
        }


        System.out.println("Sua palavra: " + word);
        System.out.println("Vogais: "+ contvg);
        System.out.println("Consoantes: "+contcon);


    }
}
