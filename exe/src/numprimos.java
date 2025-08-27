import java.util.Scanner;

public class numprimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;

        System.out.println("Digite um número e descubra se este é primo ou não");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cont++;

            }

        }
        if(cont >= 3){
            System.out.println("Seu número não é primo.");
        } else {
            System.out.println("Seu número é primo.");
        }
    }
}
