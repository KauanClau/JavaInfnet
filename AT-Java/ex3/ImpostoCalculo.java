import java.util.Scanner;

public class ImpostoCalculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu salário mensal: ");
        double salario = sc.nextDouble();

        double salarioAnual = salario * 12;
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        double salarioLiquido = salarioAnual - imposto;

        System.out.println("\nNome: " + nome);
        System.out.println("Salário Anual: R$ " + salarioAnual);
        System.out.println("Imposto de Renda: R$ " + imposto);
        System.out.println("Salário Líquido anual: R$ " + salarioLiquido);

        sc.close();
    }
}
