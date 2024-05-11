package Day9.PracticeExamples;

import java.util.Scanner;

public class LettersGrade {
    public static void main(String[] args){

        System.out.print("Enter a  grade number: ");
        Scanner grade = new Scanner(System.in);
        int g = grade.nextInt();

        if(g >= 90 && g <= 100)
        System.out.println("A");
        if(g >= 80 && g <= 89)
        System.out.println("B");
        if(g >= 70 && g <= 79)
        System.out.println("C");
        if(g >= 60 && g <=69)
        System.out.println("D");
        if(g<60)
        System.out.println("F");

    grade.close();
    }
}
