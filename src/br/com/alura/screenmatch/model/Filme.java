package br.com.alura.screenmatch.model;

public class Filme extends Titulo{
    private boolean aluguel;

    //Getter e Setter
    public boolean getAluguel() {
        System.out.println("Aluguel: " + aluguel);
        return false;
    }

    public void setAluguel(boolean aluguel) {
        this.aluguel = aluguel;
    }
}