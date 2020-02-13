package exercicio01;

public class Identificacao {
    private int id;
    private String nome;
    private int idade;

    public Identificacao(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("-------Dados--------");
        System.out.println("Registro: "+id+" Nome: "+nome+" idade: "+idade);
    }

    public void mostrarNome(){
        System.out.println("Nome: "+nome);
    }
}
