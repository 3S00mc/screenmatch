public class Filme {
    String nomeDoFilme;
    int anoDeLancamento;
    int duracaoEmMinutos;
    double somasDasAvaliacoes;
    int totalDeAvaliacoes;
    boolean incluidoNoPlano;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nomeDoFilme);
        System.out.printf("Ano de Lancamento: %d\n", anoDeLancamento);
        System.out.printf("Duracao em minutos: %d\n", duracaoEmMinutos);
    }

    void setAvaliacao( double avaliacao){
        somasDasAvaliacoes += avaliacao;
        totalDeAvaliacoes++;
    }

    double getMediaDasAvaliacoes(){
        return somasDasAvaliacoes / totalDeAvaliacoes;
    }

}