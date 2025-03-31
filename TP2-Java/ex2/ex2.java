import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota do segundo bimestre: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a nota do quarto bimestre: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;;

        if(media >= 7){
            System.out.println("Parabéns! Voce foi aprovado! Sua media foi de " + media);
        } else if (media >= 5 && media <= 6.9){
            System.out.println("Voce ficou em recuperacao! Sua media foi de " + media);
        } else {
            System.out.println("Voce foi reprovado! Sua media foi de " + media);
        }

        sc.close();
    }
}