package io.github.annekarolinneds;

public class MarioGrande implements MarioState {

    public MarioState pegarCogumelo(){
        System.out.println("+ 1000 pts! Obaa");
        return this;
    }
    public MarioState pegarFlor(){
    System.out.println("Mario Grande com Fogo!");
        return new MarioFogo();
    }
    public MarioState pegarPena(){
        System.out.println("Mario com Capa!");
        return new MarioCapa();
    }
    public MarioState levarDano(){
        System.out.println("Mario Pequeno!");
        return new MarioPequeno();
    }
}

