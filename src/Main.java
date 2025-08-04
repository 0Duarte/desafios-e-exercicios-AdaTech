import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();
        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        Conta conta = new Conta(nome, numero, 0);
        Conta contaDestino = new Conta("Conta Destino", 999, 0);

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Pagar");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                if (conta.depositar(valor)) {
                    System.out.println("Depósito ok. (-0,50)");
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (opcao == 2) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                if (conta.sacar(valor)) {
                    System.out.println("Saque ok. (-0,50)");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido");
                }
            } else if (opcao == 3) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                if (conta.transferir(contaDestino, valor)) {
                    System.out.println("Transferência ok. (-0,50)");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido");
                }
            } else if (opcao == 4) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                if (conta.pagar(valor)) {
                    System.out.println("Pagamento ok. (-0,50)");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido");
                }
            } else if (opcao == 5) {
                System.out.println("Tchau!");
            } else {
                System.out.println("Opção inválida");
            }
            System.out.printf("Saldo: R$%.2f\n", conta.getSaldo());
        }
        sc.close();
    }
}