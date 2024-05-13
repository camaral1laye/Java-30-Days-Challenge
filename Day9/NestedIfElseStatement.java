package Day9;

import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args){

        System.out.print("Enter the number: ");

        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        if(n>10)
            System.out.println(n + " > 10");
        else if(n==10)
            System.out.println(n +" = 10");
        else
            System.out.println(n +" < 10");


    number.close(); 
    }
    
}
