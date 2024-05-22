package desafio_dio_conta_bancaria;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------CONTA BANCÁRIA---------------");
        System.out.println();
        System.out.println("Por favor, digite o número da Conta: (1021)");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Agora digite o número da Agência: (067-8)");
        agencia = sc.next();
        sc.nextLine();

        System.out.println("Me informe seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Agora me informe seu saldo atual: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um valor numérico para o saldo:");
            sc.next();
        }
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
                + "nosso banco, sua agência é %s, "
                + "conta %d e seu saldo %.2f já está disponível"
                + " para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();
    }

}
