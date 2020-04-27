package test;

import interfacePackage.Hello;

public class Test {
    public static void flyCall(Fly fly){
        fly.fly();
    }
    public static void fightCall(Fight fight){
        fight.fight();
    }
    public static void swimCall(Swim swim){
        swim.swim();
    }
    public static void heroCharacter(HeroCharacter character){
        character.fight();
    }
    public static void main(String[] args) {
        /*HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();
        helloWorld.adjust();
        helloWorld.play();*/
        Hero hero=new Hero();
        flyCall(hero);
        fightCall(hero);
        swimCall(hero);
        heroCharacter(hero);
    }
}


interface Fly{
    void fly();
}

interface Swim {
    void swim();
}

interface Fight {
    void fight();
}

class HeroCharacter {
    public void fight() {
        System.out.println("HeroCharacter fight: " + getClass().getSimpleName());
    }
}

class Hero extends HeroCharacter implements Fight,Fly,Swim{
    @Override
    public void fly() {
        System.out.println("Hero fly: "+getClass().getSimpleName());
    }
    public void swim(){
        System.out.println("Hero swim: "+getClass().getSimpleName());
    }
}

class HelloWorld implements Hello {
    @Override
    public void print() {
        System.out.println("Hello World");
    }

    @Override
    public void play() {
        System.out.println("Play  all over the world");
    }

    @Override
    public void adjust() {
        System.out.println("Adjust all over the world");
    }
}

abstract class HelloLucy implements Hello {
    @Override
    public void print() {

    }

    @Override
    public void play() {

    }

    public abstract void adjust();
}
