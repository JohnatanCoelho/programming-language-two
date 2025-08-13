package org.example;

import java.util.ArrayList;
import java.util.List;

public class Baralho{

    private List<Carta> cartas;

    public Baralho(){
        cartas = new ArrayList<>();
        String[] naipes = {"Ouro","Espada", "Copas", "Paus"};
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Valete", "Rei"};

        // Adicionando as cartas
        for(String naipe: naipes){
            for(String nome: nomes ){
                cartas.add(new Carta(nome, naipe));
            }
        }

        // Adicionar as 4 coringas
        for(int i = 0; i < 4; i = i + 1){
            cartas.add(new Carta("Coringa", "Coringa"));
        }
    }

    public void embalharar(){
        for(int i = cartas.size() - 1; i > 0; i = i - 1){
            int j = (int) (Math.random() * (i + 1));

            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public void distribuirCarta(){
        int index = cartas.toArray().length - 1;
        Carta cartaTirada = cartas.get(index);

        if (cartaTirada != null) {
            System.out.println(cartaTirada);
        } else {
            index = index - 1;
            cartaTirada = cartas.get(index);
            System.out.println(cartaTirada);
        }
        cartas.remove(index);

    }

    public void asCarta(){
        Boolean resultado = null;

        for(int i = cartas.size() - 1; i > 0; i--) {
            Carta cartaCheiaOuNao = cartas.get(i);
            if (cartaCheiaOuNao.equals("")) {
                resultado = false;
            } else {
                resultado = true;
            }
        }
        System.out.println(resultado);
    }

    public void imprimirBaralho(){
        for (Carta carta: cartas){
            System.out.println(carta);
        }
    }

}