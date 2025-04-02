

public class LocadoraMain {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo("ABC-1234", "Toyota Corolla", 2020, 50000);
        Veiculo carro2 = new Veiculo("XYZ-5678", "Honda Civic", 2019, 60000);

        System.out.println("Detalhes dos veículos:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        System.out.println("Registrando viagens...");
        carro1.registrarViagem(150);
        carro2.registrarViagem(300);

        System.out.println("\nDetalhes atualizados:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
