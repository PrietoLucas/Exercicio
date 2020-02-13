package exercicio04;

public class Funcionario extends Pessoa {
    private int matricula;

    public Funcionario(String nome, int idade, String cidadeNasc, int matricula) {
        super(nome, idade, cidadeNasc);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibirDados(){
        System.out.println("Nome: "+getNome()+" Idade: "+getIdade()+" cidade: "+getCidadeNasc()+ " matricula: "+this.matricula);
    }
}
