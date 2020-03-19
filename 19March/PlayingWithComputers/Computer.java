
package playwithcomputers.computer;


public abstract class Computer {
    private String brand;
    protected int price;
    private static int computersCreated;

    private Computer(int price) {
        this.price = price;
        computersCreated++;  //default value 0 
    }


    public Computer(String brand, int price) {
        this(price);   //chaining Constructor
        this.brand = brand;
        
    }


    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {  //no access in main
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public abstract void setPrice(int price);
        
    
    public static int getComputersCreated(){
        return computersCreated;
    }
   
    
   
    
}
