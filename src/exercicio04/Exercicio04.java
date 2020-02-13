package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucas", 10,"Teste","131313131");
        Funcionario f1 = new Funcionario("Caio",30,"Cacho",11);

        c1.exibirDados();
        f1.exibirDados();
    }
}
