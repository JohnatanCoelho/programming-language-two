package org.example;

public class Carta {

    private String nome;
    private String naipe;

    public Carta(String nome, String naipe){
        this.nome = nome;
        this.naipe = naipe;
    }

    //GETs
    public String getNome() {
        return nome;
    }

    public String getNaipe() {
        return naipe;
    }

    //SETs
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString(){
        return nome + " de " + naipe;
    }
}
