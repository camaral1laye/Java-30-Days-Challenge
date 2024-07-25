package Day9.PracticeExamples;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        
        System.out.print("Enter your four digit number: ");
        Scanner n = new Scanner(System.in);

        int number = n.nextInt();

        if((number < 1000 || number > 9999)){
            System.out.println(number + " is not a four digit number");
        }
        else{
        
        int firstDigit = number / 1000;
        int SecondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;
        int fourthDigit = number % 10;

        int sum1 = firstDigit + SecondDigit;
        int sum2 = thirdDigit + fourthDigit;

        if(sum1 == sum2)
            System.out.println("Lucky Number");
        else 
            System.out.println("Not Lucky Number");

    n.close();
        }
    }
}
