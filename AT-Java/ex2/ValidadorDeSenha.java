package Main;

import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        String senha;
        while (true) {
            System.out.print("Digite uma senha: ");
            senha = sc.nextLine();

            String erro = validarSenha(senha);
            if (erro == null) {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else {
                System.out.println("Erro: " + erro);
                System.out.println("Tente novamente! Use pelo menos 8 caracteres, incluindo uma maiúscula, um número e um símbolo.");
            }
        }

        sc.close();
    }

    public static String validarSenha(String senha) {
       if (senha.length() < 8) {
           return "A senha deve possuir no mínimo 8 caracteres";
       }

        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;
        String caracteresEspeciais = "!@#$%^&*()_+-={}[]:;'\"\\|,.<>?/";

        // Percorre a senha e verifica os critérios
        for (char caracteres : senha.toCharArray()) {
            if (Character.isUpperCase(caracteres)) {
                temMaiuscula = true;
            }
            if (Character.isDigit(caracteres)) {
                temNumero = true;
            }
            if (caracteresEspeciais.contains(String.valueOf(caracteres))) {
                temEspecial = true;
            }
        }

        if (!temMaiuscula) {
            return "A senha precisa ter pelo menos uma letra maiúscula.";
        }
        if (!temNumero) {
            return "A senha precisa ter pelo menos um número.";
        }
        if (!temEspecial) {
            return "A senha precisa ter pelo menos um caractere especial.";
        }

        return null; // se a senha for válida
    }
}