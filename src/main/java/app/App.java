package app;

import zoo.animals.Tiger;

public class App {

    public static void main(String[] args) {
        Tiger myTiger = new Tiger(23);
        // Integer hungerLevel = myTiger.getHungerLevel();
        System.out.println("name: " + myTiger.getName() + ". HungerLevel: " + myTiger.getHungerLevel());
        myTiger.makeSound();
        System.out.println(myTiger.getHungerLevel());
        myTiger.feed();
        System.out.println(myTiger.getHungerLevel());
        Tiger myTigerToo = new Tiger("Bibi");
        System.out.println(myTigerToo.getHungerLevel() + " " + myTigerToo.getName());

        myTiger.move();
        myTiger.makeSound();

    }
}
