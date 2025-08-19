package org.example.test;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
   private List<Carta> cartas = new ArrayList<>();

    public List<Carta> getCartas() {
        return cartas;
    }

    public Baralho(){
        String[] naipes = {"Ouro", "Espada", "Copas", "Paus"};
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Dama", "Valete", "Rei"};

        for(String naipe: naipes){
            for(String nome: nomes){
                cartas.add(new Carta(nome, naipe));
            }
        }

        for(int i = 0; i < 4; i++){
            cartas.add(new Carta("Coringa", "Coringa"));
        }
    }

    public void embalhararCartas(){
        for(int i = cartas.size() - 1; i > 0; i--){
            int j = (int) (Math.random() * (i + 1));

            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);

        }
    }

    public void distribuirCartas(){
        int index = cartas.size() - 1;
        Carta cartaTirada = cartas.get(index);

        if(cartaTirada != null) {
            System.out.println("A carta tirada foi: " + cartaTirada);
            cartas.remove(index);
        }

    }

    public Boolean hasCartas(){
        boolean result = false;
        for(int i = cartas.size() - 1; i >= 0; i-- ){
            Carta carta = cartas.get(i);
            if(carta != null){
                result = true;
            }else {
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }

    public void imprimirBaralho(){
        for(Carta carta: cartas) {
            System.out.println(carta);
        }

    }




}
