import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme aProcuraDaFelicidade = new Filme();

        aProcuraDaFelicidade.setNome("A Procura da Felicidade");
        aProcuraDaFelicidade.setAno(2006);
        aProcuraDaFelicidade.setDuracao(117);
        aProcuraDaFelicidade.setAvaliacao(8);
        aProcuraDaFelicidade.setCatalogo(false);
        aProcuraDaFelicidade.setAluguel(true);

        aProcuraDaFelicidade.exibeFichaTecnica();
        aProcuraDaFelicidade.getAluguel();

        Serie oMentalista = new Serie();

        oMentalista.setNome("O Mentalista");
        oMentalista.setAno(2008);
        oMentalista.setTemporadas(7);
        oMentalista.setEpisodios(151);
        oMentalista.setDuracao(40);
        oMentalista.setAvaliacao(7.3);
        oMentalista.setCatalogo(true);

        oMentalista.exibeFichaTecnica();
    }
}