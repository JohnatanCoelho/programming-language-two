package org.example;

public class Test {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        baralho.embalharar();
        baralho.imprimirBaralho();
        baralho.asCarta();

        System.out.println("----------------");

        for(int i = 56; i > 0; i--) {
            baralho.distribuirCarta();
        }
        baralho.asCarta();

    }
}
