package Day7;

public class Instantiating {
    
    public static void main(String[] args) {
        String name1 = "Messi";
        String name2 = "Messi";
        String name3 = "Messi";
        name3 = name1;
        name3 = new String("Messi Jr");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }
    
    
}
