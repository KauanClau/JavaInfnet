import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome da mãe: ");
        String mae = sc.nextLine();
        System.out.println("Nome do pai: ");
        String pai = sc.nextLine();

        int tamanhoNomeUsuario = nome.length();
        int tamanhoNomeMae = mae.length();
        int tamanhoNomePai = pai.length();

        if (tamanhoNomeUsuario > tamanhoNomeMae && tamanhoNomeUsuario > tamanhoNomePai) {
            System.out.println("Legal! O seu nome tem mais letras que o nome da sua mãe e o seu pai");
        } else if (tamanhoNomeUsuario > tamanhoNomeMae) {
            System.out.println("O seu nome tem mais letras que o nome da sua mãe, mas não do seu pai.");
        } else if (tamanhoNomeUsuario > tamanhoNomePai) {
            System.out.println("O seu nome tem mais letras que o nome do seu pai, mas não da sua mãe.");
        } else {
            System.out.println("É... o seu nome não tem mais letras que o da sua mãe nem o do seu pai.");
        }

        sc.close();
    }
}
