package Day9.PracticeExamples;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {

        Scanner length = new Scanner(System.in);
        System.out.print("Enter the first length: ");
        int l1 = length.nextInt();
        System.out.print("Enter the second length: ");
        int l2 = length.nextInt();
        System.out.print("Enter the third length: ");
        int l3 = length.nextInt();
        

        if(l1==l2 && l2==l3)
        System.out.println("Equilateral Triangle");
        if((l1==l2 && l1!=l3) || (l1==l3 && l1!=l2) || (l2 ==l3 && l2!=l1) || (l3==l1 && l3!=l1))
        System.out.println("Isosceles Triangle");
        if(l1 != l2 && l2 !=l3 && l1 != l3)
        System.out.println("Scalene Trianlge");


    length.close();
    }
}
