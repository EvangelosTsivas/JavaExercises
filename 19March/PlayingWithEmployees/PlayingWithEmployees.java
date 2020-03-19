
package playingwithemployees;

import java.util.ArrayList;
import java.util.List;



public class PlayingWithEmployees {

  /*1. Create class Employee with name and salary.
2. Create subclasses Teacher, Receptionist, Director
3. Teacher teach(), Receptionist greet(), Director guide()
4. Interfaces Advisable, Driving
5. Advisable has method giveAdvice(), Driving has method drive().
6. Teacher-->Advisable, Receptionist-->Driving, Director-->both.
7. Create 2 Teachers, 1 Receptionist, 2 Director. Put them in a list.
7a. Add abstract method work() in Employee.
7b. Each work() method will call the special method each Subclass has.
7c. Ask each employee to work().
8. Separate those that can drive from those that can advice.*/



    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Nick", 1000);
        Teacher teacher2 = new Teacher("Mary", 800);
        Employee receptionist = new Receptionist("Peter", 1200);
        Employee director1 = new Director("Andy", 2000);
        Employee director2 = new Director("Jonathan", 2500);
        
        List<Employee> employees = new ArrayList();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist);
        employees.add(director1);
        employees.add(director2);
        
        for(Employee employee:employees ){
            employee.work();
            
        }
        
        
        //        boolean isAdvisable = teacher1 instanceof Advisable;
//        System.out.println("teacher is Advisable : " + isAdvisable);
//       
//        Director director3 = new Director("Panagiotis", 3000);
//        director3.speedUp();
//        Advisable advisable = new Director("Kaliopi",2000);
//       // Advisable ad = new Advisable();





         //how many advisers and drivers do we have ??
         System.out.println("*****Advisers and Drivers*****");
        List<Employee> advisers = new ArrayList();
        
        for (Employee emp: employees){
            if(emp instanceof Advisable){
                advisers.add(emp);
            }
        }
        System.out.println("We have " +advisers.size()+ " employees that advice");
        for(Employee advisor:advisers){
            System.out.printf("%s ,",advisor.getName());
        }
        System.out.println();
        List<Employee> drivers = new ArrayList();
        
        for(Employee emp : employees){
            if(emp instanceof Driving){
                drivers.add(emp);
            }
        }
        
        System.out.println("We have " +drivers.size()+ " employees that can drive");
        for(Employee driver:drivers){
           System.out.printf("%s ,",driver.getName());
        }
        System.out.println();
        
        
        

    }

}
