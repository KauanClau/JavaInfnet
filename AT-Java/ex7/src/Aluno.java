import java.util.Scanner;

public class Aluno {
    // Atributos
    String nome;
    String matricula;
    double nota1, nota2, nota3;

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("Média final: " + media);
        if (media >= 7) {
            System.out.println("Status: Aprovado ✅");
        } else {
            System.out.println("Status: Reprovado ❌");
        }
    }
}
