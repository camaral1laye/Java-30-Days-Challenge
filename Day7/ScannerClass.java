package Day7;

import java.util.Scanner;

public class ScannerClass{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your String variable:");
        System.out.println(input.next());

        System.out.print("Enter your boolean variable:");
        System.out.println(input.nextBoolean());

        System.out.print("Enter your double variable:");
        System.out.println(input.nextDouble());

        System.out.print("Enter Your Float variable:");
        System.out.println( input.nextFloat());

        System.out.print("Enter Your integer variable:");
        System.out.println(input.nextInt());
    }

}