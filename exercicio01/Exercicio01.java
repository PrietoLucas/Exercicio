package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Identificacao iden = new Identificacao(1,"Lucas",20);
        Identificacao iden2 = new Identificacao(2,"Jose",10);
        Identificacao iden3 = new Identificacao(3,"Thiago",40);

        iden.imprimir();
        iden2.imprimir();
        iden3.imprimir();

        iden.mostrarNome();
    }
}
