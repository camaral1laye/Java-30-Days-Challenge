package Day7;

import java.util.Scanner;

public class ExcerciceNameAge {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
       
        String Name =input.nextLine();

        System.out.print("Enter your age: ");

        int Age = input.nextInt();

        System.out.println("Your name is " + Name + " your are " + Age + " Years Old!");

    input.close();
    }
}
