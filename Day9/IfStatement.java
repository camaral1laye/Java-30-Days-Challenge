package Day9;

//import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
       
        /*Scanner max = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = max.nextInt();
        System.out.print("enter the value of y: ");
        int y = max.nextInt();*/

        if(x>y)
            System.out.println("The max value is " + x);

        if(x<y)
            System.out.println("The max value is " + y);
        if(x==y)
            System.out.println("The number are equal");
        
       // System.out.println("Invalid");
    }
}
