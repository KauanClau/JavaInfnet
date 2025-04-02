import java.util.*;

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // gera 6 números aleatórios
        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60) + 1);
        }

        // solicita 6 números ao usuário
        Set<Integer> numerosUsuario = new HashSet<>();
        System.out.println("Digite 6 números entre 1 e 60:");

        while (numerosUsuario.size() < 6) {
            System.out.print("Número " + (numerosUsuario.size() + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
            } else if (!numerosUsuario.add(numero)) {
                System.out.println("Número já inserido! Escolha outro.");
            }
        }

        // compara
        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
        System.out.println("Seus números: " + numerosUsuario);
        System.out.println("Você acertou " + acertos.size() + " números: " + acertos);

        scanner.close();
    }
}

