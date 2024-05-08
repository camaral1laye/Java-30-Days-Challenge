package Day9;

public class MaxTwoNumber {
    public static void main(String[] args) {
        
        int z = 10;
        int x = 15;

        int max = z > x ? z : x;
        System.out.println(max);

        NameExist();
    }

    public static void NameExist(){

        String Name = "Neso Academy";
        String NewName = "Tesla";
        Name = NewName;

        System.out.println(Name.isEmpty()? " The name is not empty": Name);
        System.out.println(!Name.isBlank()? " The name is not blank": Name);
    }
    
}
