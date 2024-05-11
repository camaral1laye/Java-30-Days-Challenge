package Day9.PracticeExamples;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>0)
        System.out.println("Postive");
        if(n<0)
        System.out.println("Negative");
        if(n==0)
        System.out.println("Zero");

        s.close();
    }
    
}
