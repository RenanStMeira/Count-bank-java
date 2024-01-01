package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    static Scanner input = new Scanner(System.in);

    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();

        operacoes();
    }

    public static void operacoes() {
        System.out.println("-------------------------");
        System.out.println("-------------Bem vindos a nossa Agência----------------");
        System.out.println("***** Selecione uma operação que deseja realizar ******");
        System.out.println("|   Opção 1 - Criar Conta   |");
        System.out.println("|   Opção 2 - Depositar     |");
        System.out.println("|   Opção 3 - Sacar         |");
        System.out.println("|   Opção 4 - Transferir    |");
        System.out.println("|   Opção 5 - Listar        |");
        System.out.println("|   Opção 6 - Sair          |");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1;
                criarConta();
                break;
            case 2;
                depositar();
                break;
            case 3;
                sacar();
                break;
            case 4;
                transferir();
                break;
            case 5;
                listar();
                break;
            case 6;
                System.out.println("Obrigado por usar nossos serviços");;
                System.exit(0);

            default:
                System.out.println("Opção invalida");
                operacoes();
                break;
        }
    }

    public static void criarConta() {
        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\ncpf: ");
        String cpf = input.next();

        System.out.println("\nEmail: ");
        String email = input.next();

        Pessoa pessoa = new Pessoa(nome, cpf, email);

        Conta conta = new Conta(pessoa);

        contasBancarias.add(conta);

        System.out.println("Conta criada com sucesso");

        operacoes();
    }


}
