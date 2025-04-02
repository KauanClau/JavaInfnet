package ProjetoEmpresa;

// Gerente com bônus de 20%
public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }
}

