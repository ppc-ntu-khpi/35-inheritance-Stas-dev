package test;

import domain.Penguin;


 /**
 * The class Animal test
 */ 
public class AnimalTest {


/** 
 *
 * Default Main
 *
 * @param args  the args
 */
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
