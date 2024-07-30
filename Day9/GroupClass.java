package Day9;

import java.util.Scanner;

public class GroupClass {
    public static void main(String[] args) {


        System.out.print("Enter your grade to determine your class: ");
        Scanner GroupLevel = new Scanner(System.in);
        int group = GroupLevel.nextInt();

        switch (group){
            case 1:
                System.out.println("Your are in First Class");
                break;
            case 2:
                System.out.println("You are in Second Class");
                break;
            case 3:
                System.out.println("You are in third Class");
                break;
            case 4:
                System.out.println("You are in Fouth Class");
                break;

            case 5:
                System.out.println("Your are in the fith class");
                break;
            default:
                System.out.println("none of the above");

                GroupLevel.close();
        }
    }
}
