package io.github.annekarolinneds;

public class MarioFogo implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("+ 1000 pts! Obaa");
        return this;
    }
    public MarioState pegarFlor(){
        System.out.println("+ 1000 pts! Obaa");
        return this;
    }
    public MarioState pegarPena(){
        System.out.println("Mario Grande com Capa!");
        return new MarioCapa();
    }
    public MarioState levarDano(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
}
