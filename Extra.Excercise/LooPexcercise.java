import java.util.Scanner;

public class LooPexcercise {
    public static void main(String[] args) {
        
        Scanner  s = new Scanner(System.in);

        int sum = 0;

        while(sum<=100){
            System.out.print("Enter the number: ");
            
            sum+= s.nextInt();
        }
                System.out.println("Done "+ sum);
        
            
    s.close();        
        }
   
}
