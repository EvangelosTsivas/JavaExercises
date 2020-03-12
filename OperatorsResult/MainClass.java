package mypackage;

public class MainClass {

    public static void main(String[] args) {
        
        byte x = 1;
        byte y = 2;

        byte result1 = (byte) (-x + x++ * 2);
        System.out.println("Result 1 = " + result1);
       System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        System.out.println("---------");
        
        byte result2 = (byte) ((x++ + --y) + --y);
        System.out.println("Result 2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        System.out.println("---------");
        
        byte result3 = (byte) (x + x);
        System.out.println("Result 3 = " + result3);       
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
