import java.util.Scanner;

public class EmprestimoSim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        int parcelas;
        do {
            System.out.print("Digite o número de parcelas (entre 6 e 48): ");
            parcelas = sc.nextInt();
            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Número de parcelas inválido. Escolha entre 6 e 48.");
            }
        } while (parcelas < 6 || parcelas > 48);

        // Taxa de juros
        double taxaJuros = 0.03; // 3% ao mês
        double valorTotal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
        double valorParcela = valorTotal / parcelas;

        // Exibição dos resultados
        System.out.println("\nNome: " + nome);
        System.out.println("Valor do Empréstimo: R$ " + valorEmprestimo);
        System.out.println("Número de Parcelas: " + parcelas);
        System.out.println("Valor Total a Pagar: R$ " + valorTotal);
        System.out.println("Valor de Cada Parcela: R$ " + valorParcela);

        sc.close();
    }
}
