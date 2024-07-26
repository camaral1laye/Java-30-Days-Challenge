import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {

        System.out.print("Enter a armstrong number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number < 100 || number > 999 ){
            System.out.println("This is not an three-digits number");
        }else{
        int hundredsDigit = number / 100;
        int tensDigit = (number % 100) / 10;
        int unitsDigit = number % 10;

        int SumCube = (int) (Math.pow(hundredsDigit,3) + Math.pow(tensDigit,3) + Math.pow(unitsDigit,3));

        if(number == SumCube){
            System.out.println("This is an armstrong number");
           
        }else{
            System.out.println("This is not an armstrong number");
        
        }    
     }
     scanner.close();
    }
}


