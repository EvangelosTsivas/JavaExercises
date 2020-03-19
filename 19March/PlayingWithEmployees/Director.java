
package playingwithemployees;


public class Director extends Employee implements Driving,Advisable {

    public Director(String name, int salary) {
        super(name, salary);
    }

    
    
    
    public void guide(){
        System.out.println(getName()+" director is guiding");
    }

    @Override
    public void drive() {
        System.out.println(getName()+ " director is driving");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName()+ " director is giving advice");
    }

    @Override
    public void work() {
        guide();
   }
  
    
}
