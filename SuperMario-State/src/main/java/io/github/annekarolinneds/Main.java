package io.github.annekarolinneds;

public class Main {
    public static void main(String[] args) {
        System.out.println("Super Mario Bros");
        System.out.println("Estados do Mario\n");

        Mario mario = new Mario();

        mario.pegarCogumelo(); //Mario Grande
        mario.pegarCogumelo(); // +1000pts
        mario.pegarFlor(); //Mario Grande com fogo
        mario.levarDano(); //Mario Grande
        mario.levarDano(); //Mario Pequeno
        mario.levarDano(); //Mario Pequeno
    }
}