package ContaBanco;

import java.util.Scanner;

public class ContaBancaria {

    public static void ContaBancaria (String [] args) {


        Scanner input = new Scanner(System.in); //recebe o valor que o usuário irá digitar

        int opcao; //inteiro que recebe as opções do menu

        do { //laço de repetição para exibir o menu
            System.out.println ("1-Abrir Conta");
            System.out.println ("2-Sacar");
            System.out.println ("3-Depositar");
            System.out.println ("4-Saldo");
            System.out.println ("5-Sair");
            opcao = input.nextInt();

        } while (opcao !=5); //enquanto os números forem diferentes de 5 ele irá rodar

    }
}




