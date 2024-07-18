package Day7;

import java.util.Scanner;

public class ExcerciseFavorite {

    public static void main(String[] args)
    {
        System.out.print("Enter your Favorite Number: ");
        Scanner n = new Scanner(System.in);
        //double Number = n.nextInt();
        //System.out.println(Number + " is my favorite number too!!");
        System.out.println(n.nextInt() + " is my favorite number too!!");
       
        n.close();
    }
 
}