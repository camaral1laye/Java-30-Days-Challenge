package Day9.PracticeExamples;

public class MaxTwoNumber {
    public static void main(String[] args) {
      
        int i = 30;
        int z = 20;

        int max = i > z ? i : z;
        System.out.println(max +"\n");
       
        NameExist();
    }

    public static void NameExist(){

        String name = " Google";
        String Newname = "Amazon";

        System.out.println(name.isEmpty() ? name : "This is empty");
        System.out.println(Newname.isBlank() ? Newname : "This is blank");
   
    }
    
}
