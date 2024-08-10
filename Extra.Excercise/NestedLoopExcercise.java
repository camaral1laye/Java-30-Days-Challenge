public class NestedLoopExcercise {
    public static void main(String[] args) {
        
        int rows = 8;

        for(int i =1; i <= rows; i++ ){
            for(int j = 1; j<= rows; j++){
            System.out.print(" ");
        }  
        for(int k = 1; k<= i; k++){

            System.out.print("*");
        }
            System.out.println();
        }
    }
}
