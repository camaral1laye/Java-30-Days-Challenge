package Day7;

import java.util.Scanner;

public class ScannerClass{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        System.out.println(input.next());
        System.out.println(input.nextBoolean());
        System.out.println(input.nextDouble());
        System.out.println(input.nextFloat());
        System.out.println(input.nextInt());
    }

}