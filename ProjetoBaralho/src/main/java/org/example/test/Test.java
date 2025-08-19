package org.example.test;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        List<Carta> cartas = baralho.getCartas();

        baralho.embalhararCartas();
        baralho.imprimirBaralho();

       for (int i = cartas.size() - 1; i >= 0; i--){
            baralho.distribuirCartas();
       }

        baralho.hasCartas();
    }
}
