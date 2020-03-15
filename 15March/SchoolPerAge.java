public class SchoolPerAge{
  

  public static void main(String[] args){
    
    //What class in school you're going according to age
    
    int age = Integer.parseInt(args[0]);
    if(age>0 && age<100){
      if(age<4){
        System.out.println("Not yet in school!");
      }else if(age<7){
         System.out.println("Kindergarden");
      }else if(age<13){   
        System.out.println("Elementary");
      }else if(age<16){
        System.out.println("Gymnasium");
      }else if(age<19){
        System.out.println("High School");
      }else if(age<30){
        System.out.println("University or Employment");
      }else{
        System.out.println("You should have finished school!");
      }

    }else{
      System.out.println("Invalid number!");
    }
    //cannot use switch statement cause you need boolean for this problem which is not compatible with switch
  }

}