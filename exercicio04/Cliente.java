package exercicio04;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, int idade, String cidadeNasc, String cpf) {
        super(nome, idade, cidadeNasc);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirDados(){
        System.out.println("Nome: "+getNome()+" Idade: "+getIdade()+" cidade: "+getCidadeNasc()+ " cpf: "+this.cpf);
    }
}
