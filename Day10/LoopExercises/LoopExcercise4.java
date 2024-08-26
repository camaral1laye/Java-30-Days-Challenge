package Day10.LoopExercises;

import java.util.Scanner;

public class LoopExcercise4 {
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = number.nextInt();

       // int sum = 1;
       boolean isPrime = true;
            for (int i = 2; i<=n/2; i++){
            if (n % i==0){
            isPrime =false;
            break;
            }
        }
        //System.out.println(n + "is a prime");
    
        if(isPrime && n >1){
        System.out.println(n + " is a prime number");
        } else{
            System.out.println(n + " is not a prime number");
        }

    number.close();
    }
}
