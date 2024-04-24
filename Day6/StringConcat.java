package Day6;

public class StringConcat {
    public static void main(String[] args) {
        
        String part1 = "Stockton";
        String part2 = " University";
        String full = part1  + part2;

        System.out.println(full);
        System.out.println("My favorite college is " + full);
        System.out.println(part1 + part2 + " is ranked number 5 in the country");
        System.out.println(part1 + part2 +" is number".concat(" one")+ " in New Jersey!!");

    }
    
}
