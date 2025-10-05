package br.com.alura.screenmatch.model;

public class Serie extends Titulo{
    private int temporadas;
    private int episodios;

    //Getter e Setter
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
