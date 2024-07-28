package Day10;

import java.util.Scanner;

public class doWhileLoopExcercise {
    public static void main(String[] args) {

        System.out.print("Enter a number between 1 and 10: " );
        Scanner n = new Scanner(System.in);
        int i;

        do{
            System.out.print("Enter a number between 1 and 10: ");
            i = n.nextInt();
        }while(i<1 || i> 10);
            System.out.println(i +" is between 1 and 10");
        
        n.close();
    }
}
