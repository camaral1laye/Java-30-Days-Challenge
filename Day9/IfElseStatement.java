package Day9;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        
        System.out.print("Enter the Number: ");

        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        if(n % 2==0)
        System.out.println(n + " is even");
        else
        System.out.println( n + " is Odd");

        number.close();
    }
}
