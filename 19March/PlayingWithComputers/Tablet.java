
package playwithcomputers;

import playwithcomputers.computer.Computer;


public class Tablet extends Computer{
    private boolean hasBluetooth;

    public Tablet(int price) {
        super("Unknown",price);
        hasBluetooth=false;
    }

    public Tablet(String brand, int price, boolean hasBluetooth) {
        super(brand,price);
        this.hasBluetooth = hasBluetooth;
        setPrice(price);
    }

    
    public void setPrice(int price){
          if(hasBluetooth==true){
            super.price = price+50;
     }         
}

}