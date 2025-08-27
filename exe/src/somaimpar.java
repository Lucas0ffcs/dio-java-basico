import java.util.Scanner;

public class somaimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Digite um número e veja a soma de seus ímpares e seus pares:");
        String numero = scan.nextLine();


        int par = 0;
        int impar = 0;

        for(char x : numero.toCharArray()){
            if(Integer.parseInt(Character.toString(x))%2 == 0){
                par += Integer.parseInt(Character.toString(x));
            }else{
                impar += Integer.parseInt(Character.toString(x));
            }

        }

        System.out.println("A soma dos números pares é:"+ par);
        System.out.println("E a soma dos números ímpares é:"+ impar);

    }
}
