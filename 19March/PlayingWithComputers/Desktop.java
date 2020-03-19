
package playwithcomputers;

import playwithcomputers.computer.Computer;


public class Desktop extends Computer {
    private boolean hasExtraLight;
    
    
    public Desktop(int price) {
         super("Unknown",price);
         hasExtraLight =false;
    }

    public Desktop(String brand, int price, boolean hasExtraLight) {
        super(brand,price);
        this.hasExtraLight = hasExtraLight;
        setPrice(price);
    }

   
     public void setPrice(int price){
          if(hasExtraLight==true){
            super.price =price+10;
     }      
 
}
}