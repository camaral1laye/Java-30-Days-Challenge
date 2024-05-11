package Day9;

public class MaxTwoNumber {
    public static void main(String[] args) {
        
        int z = 10;
        int x = 15;

        int max = z > x ? z : x;
        System.out.println(max +"\n");

        NameExist();
    }

    public static void NameExist(){

        String Name = "Neso Academy";
        String NewName = "Tesla";
        Name = NewName;

        System.out.println(Name.isEmpty()? Name : "The name is empty");
        System.out.println(!Name.isBlank()? Name : "The name is blank");
    }
    
}
