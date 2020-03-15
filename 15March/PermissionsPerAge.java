public class PermissionsPerAge{

  public static void main(String[] args){
  
  int age = Integer.parseInt(args[0]);
  if(age>0 && age<100){
    if(age<16){
      System.out.println("You cannot drive.");
    }else if(age<18){
      System.out.println("You can drive but not vote.");
    }else if(age<22){
      System.out.println("You can vote but not drink.");
    }else{
      System.out.println("You can do anything.");
    }

  }else{
    System.out.println("Invalid age!");
  }

  }
}