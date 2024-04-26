package Day7;

import java.util.Scanner;

public class ExcerciceNameAge {

    public static void main(String[] args) 
    {

        System.out.println("Enter your name and Age:");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Your name is: " + input.nextLine() + " your are " + input.nextInt() + " Old!");

    
    input.close();
    }
}
