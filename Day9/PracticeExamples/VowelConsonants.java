package Day9.PracticeExamples;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        
        System.out.print("Enter the letter: ");

        Scanner letter = new Scanner(System.in);
        String l = letter.nextLine();

        if(l.equals("a") || l.equals("e") || l.equals("i") || l.equals("u")|| l.equals("o"))
        System.out.println("Vowel");

        if((!l.equals("a")) && (!l.equals("e")) && (!l.equals("i")) && (!l.equals("u")) && (!l.equals("o")))
        System.out.println("Consonant");

        letter.close();
    }
}