package domain;


 /**
 * The class Penguin extends animal
 */ 
public class Penguin extends Animal  {

    private String name;


/** 
 *
 * Constructor of penguins for 3 variables
 *
 * @param weight  the weight
 * @param height  the height
 * @param name  the name

 */
    public Penguin (int weight, int height, String name) { 

        this.height = height ;
        this.weight = weight;
        this.name = name;
    }


/** 
 *
 * Default constructor of penguin
 *
 * 
 */
    public Penguin () { 

        this(55, 15, "Shkipe");
    }


/** 
 *
 * Penguin constructoor with name
 *
 * @param name  the name
 
 */
    public Penguin(String name) { 

        this(55, 15, name);
    }
    


/** 
 *
 * Mathod that allows penguin to swim
 *
 */
    public void swim() { 

        System.out.println("Penguin is swim right now!");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\n Name:\t"+ this.name+ "\n I`m penguin";
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Penguin is sleeping "); 
    }

    @Override

/** 
 *
 * Look around
 *
 */
    public void lookAround() { 

        System.out.println("Kovalski  and Riko  is here!");
    }

    @Override

/** 
 *
 * Walk
 *
 */
    public void walk() { 

        System.out.println("Penguin is walking..");
    }
    
}
