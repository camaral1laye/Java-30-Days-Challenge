package Day10;

import java.util.Scanner;

public class WhileLoopExcercise {
    public static void main(String[] args) {

        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        while(i < 1 || i > 10){
            System.out.println(i + " is not between 1 and 10. Try again: ");
            i = scanner.nextInt();
        }
        System.out.print(i + " is not between 1 and 10.Thanks! ");

        scanner.close();
    }
}
