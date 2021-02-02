package domain;

public class Animal  {

    protected int weight;

    protected int height;

    public Animal () {
        weight = 62 ;
        height = 176;
        
    }

    public void walk() {
        
    System.out.println( "Eating! ");
    }

    public void lookAround() {
        
       System.out.println("it seems like nobody else here!"); 
       
    }

    public void eat() {
        
        
       System.out.println("I`m eatin now!");
    }

    public void sleep() {
      System.out.println("Zzzzz - Zzzzz - Zzzz");
      
    }

    @Override
    public String toString() {
        return "My animal : " + "\nWeight : \t" + weight + " \nHeight : \t" + height;
    }

   
}
