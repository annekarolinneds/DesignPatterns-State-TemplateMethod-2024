package io.github.annekarolinneds;

public class MarioPequeno implements MarioState {

    public MarioState pegarCogumelo(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
    public MarioState pegarFlor(){
        System.out.println("Mario Grande com Fogo");
        return new MarioFogo();
    }
    public MarioState pegarPena(){
        System.out.println("Mario Grande com Capa");
        return new MarioCapa();
    }
    public MarioState levarDano(){
        System.out.println("Mario Perdeu - Game Over");
        return new MarioPerde();
    }
}
