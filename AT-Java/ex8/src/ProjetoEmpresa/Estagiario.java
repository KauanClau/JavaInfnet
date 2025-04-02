package ProjetoEmpresa;

// Estagiario com desconto de 10%
public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase * 0.9;
    }
}
