import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(titular, 1000); // Saldo inicial de R$1000

        conta.exibirSaldo();

        System.out.print("\nDigite o valor para depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        conta.exibirSaldo();

        System.out.print("\nDigite o valor para saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);
        conta.exibirSaldo();

        scanner.close();
    }
}

