public class Filme {
    String nomeDoFilme;
    Integer anoDeLancamento;
    Integer duracaoEmMinutos;
    double notaDeAvaliacao;
    Integer totalDeAvaliacoes;
    boolean incluidoNoPlano;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nomeDoFilme);
        System.out.printf("Ano de Lancamento: %d\n", anoDeLancamento);
        System.out.printf("Duracao em minutos: %d\n", duracaoEmMinutos);
        System.out.println("Nota de Avaliacao: " + notaDeAvaliacao);
        System.out.println("Total de Avaliacoes: " + totalDeAvaliacoes);
    }
}