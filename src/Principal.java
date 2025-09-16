public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nomeDoFilme = "A Procura da Felicidade";
        filme.anoDeLancamento = 2007;
        filme.duracaoEmMinutos = 117;

        filme.exibeFichaTecnica();

        filme.setAvaliacao(8);
        filme.setAvaliacao(6.5);
        filme.setAvaliacao(7.5);
        System.out.println("Nota: " + filme.somasDasAvaliacoes);
        System.out.println("Avaliacoes: " + filme.totalDeAvaliacoes);
        System.out.println("Nota Media: " + filme.getMediaDasAvaliacoes());
    }
}