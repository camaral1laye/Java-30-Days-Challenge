package Day7;

import java.util.Scanner;

public class ExcerciseFavorite {

    public static void main(String[] args)
    {

    System.out.print("Enter your favorite number: ");

    Scanner input = new Scanner(System.in);
    int favoriteNumber = input.nextInt();

    System.out.println(favoriteNumber + " is my favorite number too");

        input.close();
    }
}
