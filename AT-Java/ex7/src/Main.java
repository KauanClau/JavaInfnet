import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        aluno.matricula = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        aluno.nota3 = scanner.nextDouble();

        System.out.println("\nAluno: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        aluno.verificarAprovacao();

        scanner.close();
        }
}
