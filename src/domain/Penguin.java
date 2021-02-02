package domain;

public class Penguin extends Animal  {

    private String name;

    public Penguin (int weight, int height, String name) {
        this.height = height ;
        this.weight = weight;
        this.name = name;
    }

    public Penguin () {
        this(55, 15, "Shkipe");
    }

    public Penguin(String name) {
        this(55, 15, name);
    }
    

    public void swim() {
        System.out.println("Penguin is swim right now!");
    }

    @Override
    public String toString() {
        return super.toString()+"\n Name:\t"+ this.name+ "\n I`m penguin";
    }

    @Override
    public void sleep() {
        System.out.println("Penguin is sleeping "); 
    }

    @Override
    public void lookAround() {
        System.out.println("Kovalski  and Riko  is here!");
    }

    @Override
    public void walk() {
        System.out.println("Penguin is walking..");
    }
    
}
