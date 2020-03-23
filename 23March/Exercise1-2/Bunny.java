
package mypackage;


public class Bunny {
   private int bunnyNumber; 

    public Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.bunnyNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bunny other = (Bunny) obj;
        if (this.bunnyNumber != other.bunnyNumber) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bunny{" + "bunnyNumber=" + bunnyNumber + '}';
    }


    
   public void hop(){
       System.out.println("This is gerbill number "+ this.bunnyNumber + " and it's hopping!!");
   }
    
    
    
}
