
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.print("Enter the digits number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sum = sumDigits(number);
        
        System.out.println("The sum of the digits is: " + sum);
        
        scanner.close();
    }
        public static  int sumDigits(int number){
            if(number == 0){
                return 0;
            }else{
                int lastDigits = number % 10;
                int remainingDigits =number / 10;
                return lastDigits + sumDigits(remainingDigits);
            }
    }
    
}
