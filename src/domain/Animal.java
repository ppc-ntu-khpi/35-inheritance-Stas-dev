package domain;


 /**
 * The class Animal
 */ 
public class Animal  {

    protected int weight;

    protected int height;


/** 
 *
 * It is a  default constructor. 
 *
 */
    public Animal () { 

        weight = 62 ;
        height = 176;
        
    }


/** 
 *
 * Mathod that allows animal to walk
 *
 */
    public void walk() { 

        
    System.out.println( "Walking! ");
    }


/** 
 *
 * Mathod that allows animal to look around
 *
 */
    public void lookAround() { 

        
       System.out.println("it seems like nobody else here!"); 
       
    }


/** 
 *
 * Mathod that allows animal to eat
 *
 */
    public void eat() { 

        
        
       System.out.println("I`m eatin now!");
    }


/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

      System.out.println("Zzzzz - Zzzzz - Zzzz");
      
    }

    @Override

/** 
 *
 * To string - return {@link weight}, {@link height}
 *
 * @return String
 */
    public String toString() { 

        return "My animal : " + "\nWeight : \t" + weight + " \nHeight : \t" + height;
    }

   
}
