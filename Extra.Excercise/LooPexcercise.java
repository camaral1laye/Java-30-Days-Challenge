import java.util.Scanner;

public class LooPexcercise {
    public static void main(String[] args) {
        
        Scanner  s = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("Enter the number: ");

            sum+= s.nextInt();
            //break;
                if(sum < 100){
                System.out.print("Enter the number again: ");
                break;
            }
                 else if(sum>=100){
                System.out.println("Done "+ sum);
                break;
            }
            
        }
        s.close();
    }
}
