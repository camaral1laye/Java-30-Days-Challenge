import java.util.Scanner;

public class PalindromeNumCheck {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.print("Enter a five-digit number: ");
        Scanner scanner = new Scanner(System.in);

    
        int n = scanner.nextInt();
        if(n <10000 || n > 99999)
            System.out.println("The number is not a five-digit number.");
        else{

        //Extract the digits
        int firstDigit = n / 10000;
        int SecondDigit = (n % 10000) / 1000;
        int thirdDigit = (n % 1000) / 100;
        int fourthDigit = (n % 100) / 10;
        int fifthDigit =  n % 10;

        //construct the reversed number
        int reversedNumber = fifthDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + SecondDigit * 10 + firstDigit ;

        //compare the original number
        if(n == reversedNumber){
            System.out.println(n + " is a palindrome.");
        }
        else{
            System.out.println(n + " is not a palindrome");
        }
    }
        scanner.close();
    }
    
}

    

