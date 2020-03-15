public class TernaryAge{

  public static void main(String[] args){

   int age = Integer.parseInt(args[0]);
   String message = (age<18)? "Child" : "Adult";
   System.out.println(message);

  }
}