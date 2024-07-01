package Day9.PracticeExamples;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        System.out.print("Enter the year: ");
        Scanner year = new Scanner(System.in);
        int y = year.nextInt();

        if(y % 4 == 0 && y % 100 == 0)
        System.out.println("Leap year");

        if(y % 4 != 0 || y % 100 != 0)
        System.out.println("Not a Leap year");


    year.close();
    }
}

