package ProjetoEmpresa;

public class Empresa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000);
        Estagiario estagiario = new Estagiario("Kauan", 2000);

        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}

