package Day10.LoopExercises;

public class LoopsExcercise1 {
    public static void main(String[] args) {
        
        int i = 100;
        System.out.print("Even number increasing order: ");
        for(i = 1; i<=100; i++){
            if(i %2==0)
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("Odd number decreasing order: ");
        for(i =100; i>= 1 ; i--){
            if(i %2 == 0)
            System.out.print(i + " ");
        }
       
    }
       
}

    
