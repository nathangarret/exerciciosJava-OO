package org.example;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirInformacoes(){
        System.out.println("Informações sobre o livro");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de paginas: " + numeroPaginas);
    }

    public static void main(String[] args){
        Livro livro = new Livro("As vantagens de ser invísivel",
                "Stephen Chbosky",
                288);
    }
}
