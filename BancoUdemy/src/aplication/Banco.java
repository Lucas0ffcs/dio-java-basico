package aplication;
import user.Account;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String titular;
        String escolha;
        float deposito;
        Account conta;
        int choice;
        float saque;

            System.out.println("Digite o número da conta: ");
            numero = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome do titular: ");
            titular = sc.nextLine();

            System.out.println("Deseja fazer um depósito inicial? S/N");
            escolha = sc.nextLine();
            if(escolha.toUpperCase().equals("S")){
                System.out.println("Digite o valor do depósito: ");
                deposito = sc.nextFloat();
                conta = new Account(titular, numero, deposito);
            }else{
                conta = new Account(titular, numero);
            }
                while(true){
                    System.out.println("Dados da conta: ");
                    System.out.println(conta.data());
                    System.out.println(
                                  "\nRealizar depósito - 1\n" +
                                    "Realizar Saque    - 2\n" +
                                    "Mudar titular     - 3\n" +
                                    "Sair da aplicação - 4");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1:
                            System.out.println("Digite o valor a depositar:");
                            deposito = sc.nextFloat();
                            conta.deposit(deposito);
                            break;
                        case 2:
                            System.out.println("Digite o valor a sacar:");

                            saque = sc.nextFloat();
                            conta.withdraw(saque);
                            break;
                        case 3:
                            System.out.println("Digite o nome do novo titular:");
                            sc.nextLine();
                            titular = sc.nextLine();
                            conta.setUser(titular);
                            break;
                        case 4:
                            System.exit(0);

                    }
                }
    }
}
