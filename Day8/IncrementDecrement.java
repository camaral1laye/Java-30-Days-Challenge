package Day8;

public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + 5;
        int t = i++ + 5;

        //pre-incremmentation
        System.out.println("i is " + i + " J is "  + j); //37
        //postincremmentation
        System.out.println("i is "+i + " t is "+ t);//3

        int z = --i -4;
        int x = i-- -4;
        //pre-decremmentation
        System.out.println("i is " +i + " t is "+ z);

        //post-decremmentation
        System.out.println("i is " +i + " t is "+ x);

    }
    
}
