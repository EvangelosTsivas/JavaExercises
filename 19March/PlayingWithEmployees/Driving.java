
package playingwithemployees;


public interface Driving {
    //compiler will add public final static 
    //methods : compiler will add public abstract 
    
    int speed =12;
    void drive();
    
    
    public default void slowDown(){
        System.out.println("Slowing down");
    }
    
    public default void speedUp(){
        System.out.println("Speeding up");
    }
    
    public static int getSpeed(){
        return speed;
    }
    
}
