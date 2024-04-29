package Day7;

import java.util.Scanner;

public class ScannerClass{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //int
        System.out.print("Enter Your String variable: ");
        String s1 = input.nextLine();
        System.out.println("Your String is:" + s1);
        
        System.out.print("Enter your boolean variable: ");
        Boolean b1 = input.nextBoolean();
        System.out.println("Your boolean is:"+ b1);
        
        //float
        System.out.print("Enter Your Float variable: ");
        float f1 = input.nextFloat();

        //int
        System.out.print("Enter Your integer variable: ");
        int i1 = input.nextInt();
        System.out.println("You enter "+ (f1+i1));

        //double
        System.out.print("Enter your double variable: ");
        double d1 = input.nextDouble();
        System.out.println("You enter "+ (f1+i1)/d1);
        
        input.close();
    }

}