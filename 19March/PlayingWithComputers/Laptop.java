
package playwithcomputers;

import playwithcomputers.computer.Computer;


public class Laptop extends Computer{
   private boolean hasWifi;
  //private double price;
   
    public Laptop(int price) {
        super("Unknown",price);
        hasWifi=false; // den xreaiazetai einai false san default
    }

    public Laptop(String brand, int price, boolean hasWifi) {
        super(brand ,price);
        this.hasWifi = hasWifi;
        setPrice(price);
    }
           
   @Override
    public void setPrice(int price){
        if(hasWifi==true){
            this.price += price+20;   
        }
    }
    
    
    
    
}
