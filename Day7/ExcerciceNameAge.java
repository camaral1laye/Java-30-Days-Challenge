package Day7;

import java.util.Scanner;

public class ExcerciceNameAge {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = input.nextLine();

        System.out.print("Enter your age: ");
        int Age = input.nextInt();

        System.out.println(Name.concat(" you are ")+ Age+ " old!");

    input.close();
    }
}
