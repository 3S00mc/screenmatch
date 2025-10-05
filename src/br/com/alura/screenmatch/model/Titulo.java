package br.com.alura.screenmatch.model;

public class Titulo {

    private String nome;
    private int ano;
    private int duracao;
    private double avaliacao;

    private int totalAvaliacoes;
    private boolean catalogo;

    public void exibeFichaTecnica() {
        System.out.println("\n");
        System.out.println("Nome: " + nome);
        System.out.printf("Ano de Lancamento: %d\n", getAno());
        System.out.printf("Duracao em minutos: %d\n", getDuracao());
        System.out.println("Avaliacao da Crítica: " + getAvaliacao());
        System.out.println("Está incluso na catalogo? " + getCatalogo());
    }

    //Construtor

    //Getter e


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public boolean getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(boolean catalogo) {
        this.catalogo = catalogo;
    }
}