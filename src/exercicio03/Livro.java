package exercicio03;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPags;

    public Livro(String titulo, String autor, int numeroPags) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPags = numeroPags;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPags() {
        return numeroPags;
    }

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }

    public void imprimir(){
        System.out.println("Livro: "+titulo+" Do: "+ autor+" Contém: "+numeroPags+" Páginas");
    }

    public void renomear(String novoTitulo){
        this.titulo=novoTitulo;
    }
}
