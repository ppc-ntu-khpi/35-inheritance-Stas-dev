package test;

import domain.Penguin;

public class AnimalTest {

    public static  void main(String[] args) {
        Penguin penguin  = new Penguin();
        System.out.println(penguin);
        penguin.walk();
        penguin.eat();
        penguin.lookAround();
        penguin.swim();
        penguin.sleep();
    }
}
